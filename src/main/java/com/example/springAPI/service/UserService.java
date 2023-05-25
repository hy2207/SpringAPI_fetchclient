package com.example.springAPI.service;

import com.example.springAPI.client.UserClient;
import com.example.springAPI.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired //실제 api를 담당하는 client 인터페이스를 autowired
    private UserClient userClient;

    public User getUser(String nation){
        return userClient.getUser(nation);
    }

}
