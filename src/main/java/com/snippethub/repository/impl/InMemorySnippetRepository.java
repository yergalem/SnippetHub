/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.repository.impl;


import com.snippethub.repository.SnippetRepository;
import com.snippethub.model.Snippet;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rakesh Shrestha
 */
@Repository
public class InMemorySnippetRepository implements SnippetRepository {

    private final List<Snippet> listOfSnippet = new ArrayList<>();
    @Override
    public List<Snippet> getAllSnippets() {
        return listOfSnippet;
    }

    @Override
    public Snippet getSnippetById(long snippetId) {
        for(Snippet snippet: listOfSnippet){
            if(snippet.getSnippetId()==(snippetId)) {
                return snippet;
            } 
        }
        throw new IllegalArgumentException(
                String.format("Snippet with id %s not found", snippetId));
    }
    
     @Override
    public void addSnippet(Snippet snippet){

        listOfSnippet.add(snippet);
    }

}
