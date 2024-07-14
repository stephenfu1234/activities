package com.stephenfu.activities.controller;

import com.stephenfu.activities.dto.UserActivitiesDto;
import com.stephenfu.activities.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/activities/{userId}")
    public ResponseEntity<UserActivitiesDto> getActivitiesByUserId(@PathVariable int userId) {
        UserActivitiesDto userActivities = activityService.getActivitiesByUserId(userId);

        return ResponseEntity.status(HttpStatus.OK).body(userActivities);
    }

    @GetMapping("/hello")
    public String getActivities() {
        return "Hello";
    }



}
