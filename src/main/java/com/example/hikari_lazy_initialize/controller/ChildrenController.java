package com.example.hikari_lazy_initialize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.hikari_lazy_initialize.Entities.Children;
import com.example.hikari_lazy_initialize.service.ChildrenService;

@RestController
public class ChildrenController {

    @Autowired
    private ChildrenService childrenService;

    @GetMapping("/children/{cid}")
    public Children getChildById(@PathVariable int cid) {
    	
    	System.out.println("Came inside the CID: "+cid);
        return childrenService.getChildById(cid);
    }
}
