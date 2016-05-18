
package com.snippethub.repository.impl;

import com.snippethub.repository.TagRepository;
import com.snippethub.model.Tag;
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
public class InMemoryTagRepository implements TagRepository{
    
     Map<String, Tag> tags;
     List<Tag> listOfTags;
    public InMemoryTagRepository() {
        tags = new HashMap<>();
        listOfTags = new ArrayList<>();
        Tag tag1 = new Tag("javascript");
        Tag tag2 = new Tag("php");
        Tag tag3 = new Tag("java");
        listOfTags.add(tag1);
        listOfTags.add(tag2);
        listOfTags.add(tag3);
    }

    @Override
    public Tag getTagByID(String tagID) {
     
       return tags.get( tagID );
        
    }

    @Override
    public List<Tag> getAllTags() {
        return listOfTags;
    }

    @Override
    public void addTag(Tag tag) {
        listOfTags.add( tag);
    }

    @Override
    public Tag getTag(String title) {
        
        for (Tag tag :  listOfTags ) {
            
            if(tag.getTagTitle().equals(title)) 
                return tag;
        }
        
        throw new NullPointerException(InMemoryTagRepository.class.getSimpleName()+"No mathing Tags Found");
    }

    @Override
    public void deleteTag(Tag tagID) {
    }

    @Override
    public boolean editTag(Tag tag) {
        return false;
    }

    
    
}
