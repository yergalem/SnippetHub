package com.snippethub.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long userID;
    
    @Email
    @NotNull
    @NotEmpty
    @NotBlank
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;

    private String biography;

    private String phone;

    private String profilePicture;

    public User() {
    }

    public User(String email, String password, String firstName, String lastName, String biography, String phone, String profilePicture) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.biography = biography;
        this.phone = phone;
        this.profilePicture = profilePicture;
    }
    
    
    //getters
    public Long getUserID() {
        return userID;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getFullName() {
        return firstName + " " + lastName;  
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBiography() {
        return biography;
    }
    //setters
    public void setUserID(Long userID) {
       
     this.userID = userID;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.email);
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
        final User other = (User) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
