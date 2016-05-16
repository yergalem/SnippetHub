package com.snippethub01.model;


import java.util.*;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 */

@Entity
public class Snippet {

    public Snippet() {
    }
    
    @Id
    @GeneratedValue
    
    private long snippetID;

    
    private String snippetTitle;

   
    private String snippetDescription;

     
    private String snippetContent;

     
    private Date createDate;

   
    private Date modifiedDate;

    
}