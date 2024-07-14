package com.stephenfu.activities.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity {

    private int id;
    private String activityName;

    public Activity(int id, String activityName) {
        this.id = id;
        this.activityName = activityName;
    }
}
