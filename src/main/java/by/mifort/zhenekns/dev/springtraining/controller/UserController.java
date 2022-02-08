package by.mifort.zhenekns.dev.springtraining.controller;

import by.mifort.zhenekns.dev.springtraining.entity.User;
import by.mifort.zhenekns.dev.springtraining.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser(){
        List<User> users = userService.getAllUsers();
        return users;
    }

    @PostMapping("/add")
    public String createNewUser(@RequestBody User user){
        userService.createUser(user);
        return "User: " + user + " has been created!";
    }


}
