/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.controller;
//import com.snippethub.dao.SnippetRepository;
import com.snippethub.model.Snippet;
import com.snippethub.service.SnippetService;
import com.snippethub.service.TagService;
import com.snippethub.service.impl.TagServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Haftom Alemayehu <Haftom Alemayehu>
 */
@Controller
@RequestMapping("/snippets")
public class SnippetController {
    
    @Autowired
    private SnippetService snippetSerrvice;
    @Autowired
    private TagService tagService;
    
    @RequestMapping //annotation is necesssary for default one too.
    public String getAllSnippets(Model model) {
        model.addAttribute("snippets", snippetSerrvice.getAllSnippets());
        return "snippet/index";
    }

    @RequestMapping("/{id}")
    public String getSnippetById(@PathVariable("id") long snippetID, Model model) {
        model.addAttribute("snippet", snippetSerrvice.getSnippetById(snippetID));
        return "snippet/show";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getCreateSnippetForm(Model model) {
        Snippet newSnippet = new Snippet();
        model.addAttribute("newSnippet", newSnippet);
        model.addAttribute("allTags", tagService.getAllTags());
        model.addAttribute("languages", snippetSerrvice.getAllLaungauges());
        return "snippet/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processCreateSnippetForm(@ModelAttribute("newSnippet")@Valid Snippet snippetTobeAdded, HttpServletRequest request ) {
        snippetSerrvice.addSnippet(snippetTobeAdded);
        return "redirect:/snippets";
    }
    
    /**
     * Display edit form
     * @param model
     * @return 
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String getEditSnippetForm(@PathVariable("id") long snippetId, Model model) {
        Snippet newSnippet = new Snippet();
        model.addAttribute("newSnippet", newSnippet);
        return "snippet/edit";
    }
    
}
