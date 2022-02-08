package by.mifort.zhenekns.dev.springtraining.service;

import by.mifort.zhenekns.dev.springtraining.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User getUserById(long id);
    void createUser(User user);
    User updateUser(User user);
    void deleteUserById(long id);
}
