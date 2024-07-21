package com.stephenfu.activities.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserActivitiesDto {

    private final UserDto userDto;
    private final List<ActivitiesDto> activitiesDto;

}
