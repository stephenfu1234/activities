package com.stephenfu.activities.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {

    private final Integer id;
    private final String email;
    private final String name;

}
