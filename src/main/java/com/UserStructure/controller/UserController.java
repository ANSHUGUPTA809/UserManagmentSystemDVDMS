package com.UserStructure.controller;

import com.UserStructure.entity.User;
import com.UserStructure.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showLoginForm() {
        return "login"; 
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, Model model) {
        User user = userService.findByUsername(username);
        if (user != null) {
            return "success"; // Redirect to the success page
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // Reload the login page with error message
        }
    }

    /*// Keep the existing REST endpoints for user management (if needed)
    @GetMapping("/users/{username}")
    @ResponseBody
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }*/
}
