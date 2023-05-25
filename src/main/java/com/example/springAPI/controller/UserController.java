package com.example.springAPI.controller;

import com.example.springAPI.client.UserClient;
import com.example.springAPI.dto.User;
import com.example.springAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    //requiredArgsConstructor 어노테이션이 있고, 변수 선언시 final를 셋팅하면 autowired 생략이 가능
//    private final UserService userService;
    private final UserClient userClient;

    @GetMapping(value = "/api/")
    public User getUser(@RequestParam("nat") String nation){
        return userClient.getUser(nation);
    }
}
