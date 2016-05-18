package com.snippethub.service.impl;
import com.snippethub.model.Tag;
import com.snippethub.repository.UserRepository;
import com.snippethub.model.User;
import com.snippethub.repository.TagRepository;
import com.snippethub.service.TagService;
import com.snippethub.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagRepository repository;
    @Override
    public List<Tag> getAllTags() {
        return repository.getAllTags();
    }

    @Override
    public Tag getTagByID(long tagID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTag(Tag user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteTag(String tagID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editTag(Tag user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //JpaUserRepository userRepository;
    

       
}
