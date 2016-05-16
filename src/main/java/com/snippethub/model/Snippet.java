package com.snippethub.model;


import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Snippet implements Serializable {

     
    public Snippet() {
    }

    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
   
    
    
    public Snippet(String snippetTitle, String snippetDescription, String snippetContent, Date createDate, Date modifiedDate) {
        this.snippetTitle = snippetTitle;
        this.snippetDescription = snippetDescription;
        this.snippetContent = snippetContent;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
    }
 
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.snippetID ^ (this.snippetID >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Snippet other = (Snippet) obj;
        if (this.snippetID != other.snippetID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Snippet{" + "snippetID=" + snippetID + ", snippetTitle=" + snippetTitle + ", snippetDescription=" + snippetDescription + ", snippetContent=" + snippetContent + ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + '}';
    }

    
    
    public long getSnippetID() {
        return snippetID;
    }

    public void setSnippetID(long snippetID) {
        this.snippetID = snippetID;
    }

    public String getSnippetTitle() {
        return snippetTitle;
    }

    public void setSnippetTitle(String snippetTitle) {
        this.snippetTitle = snippetTitle;
    }

    public String getSnippetDescription() {
        return snippetDescription;
    }

    public void setSnippetDescription(String snippetDescription) {
        this.snippetDescription = snippetDescription;
    }

    public String getSnippetContent() {
        return snippetContent;
    }

    public void setSnippetContent(String snippetContent) {
        this.snippetContent = snippetContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
}