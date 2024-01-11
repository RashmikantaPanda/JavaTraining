package com.techm.mvc.controller;

import com.techm.mvc.model.User;
import com.techm.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String ListUsers(Model model){
        List<User> users=userRepository.findAll();
        model.addAttribute("users",users);

        return "user/list";
    }

    @GetMapping("/create")
    public String createUserForm(Model model){
        model.addAttribute("user",new User());

        return "user/create";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute User user){
        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user id: " + id));

        model.addAttribute("user", user);
        return "user/edit";
    }


    @PostMapping("edit/{id}")
    public String editUser(@PathVariable Long id, @ModelAttribute User updatedUser){
        userRepository.findById(id).ifPresent((user->{
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setAge(updatedUser.getAge());
            userRepository.save(user);
        }));
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return "redirect:/users";
    }
}
