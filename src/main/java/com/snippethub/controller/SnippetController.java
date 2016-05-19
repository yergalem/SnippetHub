/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.controller;
//import com.snippethub.dao.SnippetRepository;
import com.snippethub.model.Snippet;
import com.snippethub.model.User;
import com.snippethub.service.SnippetService;
import com.snippethub.service.TagService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value="/{title}")
    public String getSnippetByTitle(@PathVariable("title") String title, Model model) {
        model.addAttribute("snippet", snippetSerrvice.getSnippetByTitle(title));
        return "snippet/show";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getCreateSnippetForm(Model model, HttpServletRequest request) {
        if(request.getSession().getAttribute("loggedInUser") == null) {
            return "redirect:/login";
        }
        
        Snippet newSnippet = new Snippet();
        model.addAttribute("newSnippet", newSnippet);
        model.addAttribute("allTags", tagService.getAllTags());
        model.addAttribute("languages", snippetSerrvice.getAllLaungauges());
        return "snippet/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String processCreateSnippetForm(@ModelAttribute("newSnippet")@Valid Snippet snippetTobeAdded,
            BindingResult result, Model model, HttpServletRequest request ) {
        if(result.hasErrors()) {
            model.addAttribute("allTags", tagService.getAllTags());
            model.addAttribute("languages", snippetSerrvice.getAllLaungauges());
            return "snippet/create";
        }
        User user = (User) request.getSession().getAttribute("loggedInUser");
        snippetSerrvice.addSnippet(snippetTobeAdded);
        return "redirect:/users/"+user.getSlug();
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
    
    @RequestMapping(value="/search/{searchTerm}", method = RequestMethod.GET)
    public String search(@PathVariable(value = "searchTerm") String searchTerm, Model model) {
       List<Snippet> matchingSnippets = snippetSerrvice.search(searchTerm);
        model.addAttribute("matchingSnippets",matchingSnippets );
        System.out.println("size is " + matchingSnippets.size() + " for " + searchTerm);
        if(matchingSnippets.size() <= 0)
            return "snippet/notfound";
        else
            return "snippet/searchResult";
    }
    
    @RequestMapping(value = "/tag/{title}")
    public String getSnippetByTag(@PathVariable("title") String tagTitle, Model model) {
        model.addAttribute("snippets", snippetSerrvice.getSnippetByTagTitle(tagTitle));
        return "snippet/index";
    }
    
}
