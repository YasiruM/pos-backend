package com.system.pos.service;

import com.system.pos.dao.UserDao;
import com.system.pos.dto.UserDTO;
import com.system.pos.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<UserDTO> getAllUser() {
        List<User> users = this.userDao.findAll();

        List<UserDTO> userDTOS = new ArrayList<>();

        for (User user : users){
            UserDTO userDTO=new UserDTO(user);
            userDTOS.add(userDTO);
        }
        return userDTOS;
    }

    public User addUser(User user) {
        User newUser = this.userDao.saveAndFlush(user);
        return newUser;
    }

    public User getUserById(Integer userId) {
        return this.userDao.findUserByUserId(userId);
    }
}
