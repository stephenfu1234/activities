package com.stephenfu.activities.client;

import com.stephenfu.activities.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "users-service", url = "http://localhost:8080")
public interface UsersClient {

    @GetMapping("/user/{userId}")
    ResponseEntity<UserDto> getUserDetailsByUserId(@PathVariable("userId") Integer userId);

}
