package com.example.demo.user;

import com.example.demo.person.Person;
import com.example.demo.person.PersonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Validated
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("api/user")
    public List<UserInfo> getUserList() {
        return userService.getUserList();
    }

    @PostMapping("api/login")
    public void loginUser(@RequestBody UserInfo userInfo) {
        userService.checkUserAndPassword(userInfo);
    }

    @GetMapping("user/{username}")
    public UserInfo getUsernameAndName(@PathVariable @Size(min = 5, max = 15) String username) {
        return userService.getUsernameAndName(username);
    }

    @PostMapping("api/user")
    public void saveUserAndPass(@Valid @RequestBody UserInfo userInfo) {
        userService.saveUserAndPass(userInfo);
    }
}
