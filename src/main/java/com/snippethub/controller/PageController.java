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
public class PageController {
    @RequestMapping("/")
    public String home() {
        System.out.println("fuckkk");
        return "index";
    }
}
