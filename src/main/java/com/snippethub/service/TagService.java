
package com.snippethub.service;

import com.snippethub.model.Tag;
import java.util.List;

/**
 *
 * @author Yergalem
 */
public interface TagService {
     
   public List<Tag> getAllTags();
   public Tag getTagByID( long tagID );
   public void addTag(Tag user);
   public boolean deleteTag(String tagID);
   public boolean editTag(Tag user);
   
}
