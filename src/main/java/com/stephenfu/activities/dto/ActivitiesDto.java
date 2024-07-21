package com.stephenfu.activities.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ActivitiesDto {

    private final int id;
    private final String activityName;

}
