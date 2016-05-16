/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.dao.impl;

import com.snippethub.model.Snippet;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tareman
 */
@Stateless
public class SnippetFacade extends AbstractFacade<Snippet> {

    @PersistenceContext(unitName = "SnippetHubPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SnippetFacade() {
        super(Snippet.class);
    }
    
}
