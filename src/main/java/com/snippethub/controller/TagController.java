/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tekeste
 */
@Controller
@RequestMapping("/tags")
public class TagController {
    
    /**
     * Display all tags
     * @return 
     */
    @RequestMapping
    public String tags() {
        return "tag/index";
    }
}
