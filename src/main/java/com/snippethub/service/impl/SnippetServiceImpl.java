/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.service.impl;

import com.snippethub.model.Snippet;
import com.snippethub.dao.SnippetRepository;
import com.snippethub.service.SnippetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author tareman
 */
@Service
public class SnippetServiceImpl implements SnippetService{
    
 @Autowired
    SnippetRepository snippetRepository;
    
    @Override
    public List<Snippet> getAllSnippets() {
        return snippetRepository.getAllSnippets();
    }

    @Override
    public Snippet getSnippetById(long snippetID) {
        return snippetRepository.getSnippetById(snippetID);
    }
    
    @Override
    public void addSnippet(Snippet snippet){
       snippetRepository.addSnippet(snippet);
    }
    
}
