package com.example.urlhitcounter.controller;

import com.example.urlhitcounter.model.Visit;
import com.example.urlhitcounter.urlHitService.urlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class urlHitController {
    @Autowired
    private urlHitService urlService;

    @GetMapping("/count/username/{username}")
    public Visit getHitCount(@PathVariable String username){
        return urlService.getvisitor(username);
    }
    @GetMapping("find-all-visitor")
    public HashMap<String,Integer> findAllVisitors(){
        return urlService.getAllvisitors();
    }

}
