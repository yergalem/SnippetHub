package com.snippethub.model;


import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

    public UserEntity() {
    }

    @Id
    private long userID;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private String biography;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String profilePicture;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }
 
}