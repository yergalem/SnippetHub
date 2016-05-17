
package com.snippethub.controller;

import com.snippethub.model.UserEntity;
//import com.snippethub.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
 
//    @Autowired
//    UserService userService;
    /**
     * Display all users
     * @return 
     */
    @RequestMapping("/users")
    public String users() {
        return "user/index";
    }
    
    /**
     * Display user profile
     */
    @RequestMapping(value="/users/{id}", method=RequestMethod.GET)
    public String getProfile(@PathVariable("id") long snippetId) {
        return "user/show";
    }
    /**
     * Display the login form
     * @return 
     */
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String getLoginForm() {
        return "user/login";
    }
    
    /**
     * Display the register form
     * @return 
     */
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String getRegisterForm() {
        return "user/register";
    }
    
//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String authenticate(UserEntity user, HttpServletRequest request,
//            RedirectAttributes redirectAttributes) {
//        if (userService.authenticate(user)) {
//            request.getSession().setAttribute("user", user);
//            //redirectAttributes.addFlashAttribute("tagline",
//                    //"Welcome to the one and only amazing webstore");
//            return "redirect:/welcome";
//        } else {
//            throw new IllegalArgumentException("UserId and/or password invalid.");
//        }
//    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
    
}
