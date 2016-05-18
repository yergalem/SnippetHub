/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.controller;

import com.snippethub.service.SnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tekeste
 */
@Controller
public class PageController {
    @Autowired
    SnippetService snippetService;
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("snippets", snippetService.getAllSnippets());
        return "index";
    }
}
