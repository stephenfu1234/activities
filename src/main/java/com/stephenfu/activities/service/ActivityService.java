package com.stephenfu.activities.service;

import com.stephenfu.activities.client.UsersClient;
import com.stephenfu.activities.dto.UserActivitiesDto;
import com.stephenfu.activities.dto.UserDto;
import com.stephenfu.activities.model.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    @Autowired
    private UsersClient usersClient;

    public UserActivitiesDto getActivitiesByUserId(Integer userId) {
        ResponseEntity<UserDto> usersDto = usersClient.getUserDetailsByUserId(userId);

        Activity activity = new Activity(1, "My activity");

        return UserActivitiesDto.builder()
                .id(activity.getId())
                .activityName(activity.getActivityName())
                .user(usersDto.getBody())
                .build();
    }

}
