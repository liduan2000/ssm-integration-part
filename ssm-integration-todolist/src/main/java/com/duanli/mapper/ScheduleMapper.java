package com.duanli.mapper;

import com.duanli.pojo.Schedule;

import java.util.List;

public interface ScheduleMapper {
    List<Schedule> getAll();

    int deleteById(Integer id);

    int add(Schedule schedule);

    int update(Schedule schedule);
}
