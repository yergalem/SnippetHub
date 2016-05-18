package com.snippethub.model;

import java.time.LocalDate;
import java.util.*;

/**
 *
 */
public class Tag {

    /**
     * Default constructor
     */
    public Tag() {
        snippets = new ArrayList<>();
    }

    public Tag( String tagTitle, String tagDescription ) {
        
        this.tagTitle = tagTitle;
        this.tagDescription = tagDescription;
        this.createDate = LocalDate.now();
    }
    

    /**
     *
     */
    public String tagID;

    /**
     *
     */
    public String tagTitle;

    /**
     *
     */
    public String tagDescription;

    /**
     *
     */
    public LocalDate createDate;

    /**
     *
     */
    public LocalDate updateDate;
    public List<Snippet> snippets;

    public Tag(String title) {
        this.tagTitle = title;
    }

    
    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public String getTagTitle() {
        return tagTitle;
    }

    public void setTagTitle(String tagTitle) {
        this.tagTitle = tagTitle;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
    
    

}