package com.stephenfu.activities.service;

import com.stephenfu.activities.client.UsersClient;
import com.stephenfu.activities.dto.ActivitiesDto;
import com.stephenfu.activities.dto.UserActivitiesDto;
import com.stephenfu.activities.dto.UserDto;
import com.stephenfu.activities.model.Activity;
import com.stephenfu.activities.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private UsersClient usersClient;

    @Autowired
    private ActivityRepository activityRepository;

    public UserActivitiesDto getActivitiesByUserId(Integer userId) {
        // this isn't need but added just to test feign client
        ResponseEntity<UserDto> usersDto = usersClient.getUserDetailsByUserId(userId);

        List<Activity> activities = activityRepository.findAllActivitiesForUser(userId);

        List<ActivitiesDto> activitiesDtoList = activities.stream()
                .map(this::createActivityDtoFromEntity)
                .toList();

        return UserActivitiesDto.builder()
                .userDto(usersDto.getBody())
                .activitiesDto(activitiesDtoList)
                .build();
    }

    private ActivitiesDto createActivityDtoFromEntity(Activity activity) {
        return ActivitiesDto.builder()
                .id(activity.getId())
                .activityName(activity.getActivityName())
                .build();
    }


}
