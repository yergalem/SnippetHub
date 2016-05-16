/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.dao.impl;

import com.snippethub.model.Snippet;
import com.snippethub.dao.SnippetRepository;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author tareman
 */
public class JpaSnippetRepository implements SnippetRepository{
    
    
    @Inject //this annotation causes the container to inject this dependency
    private SnippetFacade snippetFacade;
    private List<Snippet> listOfSnippet;
    
     public  JpaSnippetRepository() {  
     }
    
      @Override
    public List<Snippet> getAllSnippets() {
        listOfSnippet =  snippetFacade.findAll();
        return listOfSnippet;
    }

    @Override
    public Snippet getSnippetById(long snippetID) {
        for(Snippet snippet: listOfSnippet){
            
            if(snippet.getSnippetID()==snippetID) {
                System.out.println("returning Snippet: " +snippet.getSnippetID());
                return snippet;
            } 
        }
        throw new IllegalArgumentException(
                String.format("Snippet with id %s not found", snippetID));
    }

    @Override
    public void addSnippet(Snippet product) {
        snippetFacade.create(product);
        listOfSnippet.add(product);
    }

 //   @Override
    public void initRepository() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
