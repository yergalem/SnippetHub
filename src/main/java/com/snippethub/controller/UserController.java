
package com.snippethub.controller;

//import com.snippethub.service.UserService;
import com.snippethub.model.User;
import com.snippethub.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
 
    @Autowired
    UserService userService;
    /**
     * Display all users
     * @return 
     */
    @RequestMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.getAllUsers());
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
    public String getLoginForm(Model model) {
        User user = new User();
        model.addAttribute("currentUser", user);
        return "user/login";
    }
    
    /**
     * Display the login form
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@ModelAttribute("currentUser") User user, RedirectAttributes redirectAttributes, Model model
    , HttpServletRequest request) {
        if(userService.authenticate(user)) {
            request.getSession().setAttribute("user", user);
            redirectAttributes.addFlashAttribute("loginError", "");
            return "user/show";
        }
        else {
          redirectAttributes.addFlashAttribute("loginError", "Wrong email or password");
          return "redirect:/login";
        }
    }
    
    /**
     * Display the register form
     * @return 
     */
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String getRegisterForm(Model model) {
        User newUser = new User();
        model.addAttribute("newUser", newUser);
        return "user/register";
    }

    /**
     * Save new user
     *
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registeUser(@ModelAttribute("newUser") @Valid User newUser, BindingResult result) {
        if(result.hasErrors()) {
          return "login";
        }
        userService.addUser(newUser);
        return "redirect:/login";
    }
    
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
    
}
