package com.stephenfu.activities.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserActivitiesDto {

    private final UserDto userDto;

    private final int id;
    private final String activityName;

}
