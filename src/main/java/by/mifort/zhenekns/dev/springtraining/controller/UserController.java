package by.mifort.zhenekns.dev.springtraining.controller;

import by.mifort.zhenekns.dev.springtraining.entity.User;
import by.mifort.zhenekns.dev.springtraining.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
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

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable long id){
        User user = userService.getUserById(id);
        return user;
    }

    @PostMapping("/registration")
    public String createNewUser(@RequestBody User user){
        userService.createUser(user);
        return "User: " + user + " has been created!";
    }

    @PatchMapping("/update/{id}")
    public User updateUserById(@PathVariable long id, @RequestBody User user){
        User updatedUser = userService.updateUser(id, user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    public User deleteUser(@PathVariable long id){
        userService.deleteUserById(id);
        return userService.getUserById(id);
    }


}
