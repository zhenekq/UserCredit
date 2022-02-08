package by.mifort.zhenekns.dev.springtraining.service.impl;

import by.mifort.zhenekns.dev.springtraining.entity.User;
import by.mifort.zhenekns.dev.springtraining.repository.UserRepository;
import by.mifort.zhenekns.dev.springtraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        if(!users.isEmpty()){
            return users;
        }
        return null;
    }

    @Override
    public User getUserById(long id) {
        return null;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User updateUser(long id, User user) {
        return null;
    }

    @Override
    public void deleteUserById(long id) {

    }
}
