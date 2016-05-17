package com.snippethub.model;


import java.util.*;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Snippet {

     
    public Snippet() {
    }

    /**
     * 
     */
    @Id
    private long snippetID;

    /**
     * 
     */
    private String snippetTitle;

    /**
     * 
     */
    private String snippetDescription;

    /**
     * 
     */
    private String snippetContent;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date modifiedDate;

    public long getSnippetID() {
        return snippetID;
    }

    public void setSnippetID(long snippetID) {
        this.snippetID = snippetID;
    }

    
}