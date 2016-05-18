/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.snippethub.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author tareman
 */
public class Snippet implements Serializable {

    private long snippetId;
    private String snippetTitle;
    private String snippetDescription;
    private String content;
    private Date createDate;
    private Date modifiedDate;
    private String snippetLanguage;
    private String visiblity;
    private String tags;

    public Snippet() {
        
    }
    public Snippet(String snippetTitle, String snippetDescription, String snippetContent, Date createDate, Date modifiedDate, String snippetLanguage, String visiblity, String tags) {
        this.snippetTitle = snippetTitle;
        this.snippetDescription = snippetDescription;
        this.content = snippetContent;
        this.createDate = createDate;
        this.modifiedDate = modifiedDate;
        this.snippetLanguage = snippetLanguage.toLowerCase();
        this.visiblity = visiblity;
        this.tags = tags;
    }
    
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
   
    public long getSnippetId() {
        return snippetId;
    }

    public void setSnippetId(long snippetID) {
        this.snippetId = snippetID;
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

    public String getContent() {
        return content;
    }

    public void setContent(String snippetContent) {
        this.content = snippetContent;
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

    public String getLanguage() {
        return snippetLanguage;
    }

    public void setLanguage(String language) {
        this.snippetLanguage = language;
    }

    public String getVisiblity() {
        return visiblity;
    }

    public void setVisiblity(String visiblity) {
        this.visiblity = visiblity;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    
}
