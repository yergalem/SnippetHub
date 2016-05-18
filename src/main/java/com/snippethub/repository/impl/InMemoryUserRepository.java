
package com.snippethub.repository.impl;

import com.snippethub.model.User;
import com.snippethub.repository.UserRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yergalem
 */
@Repository
public class InMemoryUserRepository implements UserRepository {
    
     Map<Long, User> users;

    public InMemoryUserRepository() {
        users = new HashMap<>();
        User user1 = new User("t@t.com","pass", "Tekeste");
        users.put(Long.MIN_VALUE, user1);
    }

    @Override
    public User getUserByID(long userID) {
     
       return users.get( userID );
        
    }

    @Override
    public List<User> getAllUsers() {
        List<User> usersList = new ArrayList<>();
        
        if ( usersList == null ) {
            throw new NullPointerException("No Users Data can be fetched");
        }
        
        for ( User user : users.values() ) {
              usersList.add(user);
        }
        
        return usersList;
    }

    @Override
    public void addUser(User user) {
        users.put( user.getUserID(), user);
    }

    @Override
    public User getUser(String userID) {
        
        for (User user :  users.values() ) {
            
            if(user.getUserID().equals(userID)) 
                return user;
        }
        
        throw new NullPointerException(InMemoryUserRepository.class.getSimpleName()+"No mathing User Found");
    }

    @Override
    public void deleteUser(User userID) {
    }

    @Override
    public boolean editUser(User user) {
        return false;
    }

    @Override
    public boolean authenticate(User user) {
        return false;
    }

    @Override
    public User getUserByEmail(String email) {
        for (User user : users.values()) {

            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
    
}
