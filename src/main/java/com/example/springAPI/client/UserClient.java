package com.example.springAPI.client;

import com.example.springAPI.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


//조회할 외부 API https://randomuser.me/api/?nat=us
@FeignClient(name = "userClient", url = "https://randomuser.me")
public interface UserClient {
    @GetMapping("/api/")
    User getUser(@RequestParam("nat") String nation);
}
