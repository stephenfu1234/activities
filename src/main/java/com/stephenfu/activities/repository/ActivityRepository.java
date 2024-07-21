package com.stephenfu.activities.repository;

import com.stephenfu.activities.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {

    @Query(value = "SELECT a FROM Activity a WHERE a.userId = ?1")
    List<Activity> findAllActivitiesForUser(Integer userId);

}
