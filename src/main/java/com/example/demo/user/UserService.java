package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void saveUserAndPass(UserInfo userInfo) {
        Optional<UserInfo> userInfoByUsername = userRepository.findUserInfoByUsername(userInfo.getUsername());
        if (userInfoByUsername.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "نام کاربری تکراری میباشد");
        }
        userRepository.save(userInfo);
    }

    public List<UserInfo> getUserList() {
        return userRepository.findAll();
    }

    public void checkUserAndPassword(UserInfo userInfo) {

        Optional<UserInfo> userInfoByUsername = userRepository.findUserInfoByUsername(userInfo.getUsername());
        if (userInfoByUsername.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "نام کاربری یافت نشد");
        }
        if (!(userInfo.getUsername().equals(userInfoByUsername.get().getUsername()))
                || !(userInfo.getPassword().equals(userInfoByUsername.get().getPassword()))) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "نام کاربری یا رمز عبور اشتباه است");
        }
    }

    public UserInfo getUsernameAndName(String username) {

        Optional<UserInfo> userInfo = userRepository.findUserInfoByUsername(username);

        if (userInfo.isPresent()) {
            return userInfo.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
    }
}
