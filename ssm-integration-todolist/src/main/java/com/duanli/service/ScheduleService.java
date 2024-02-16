package com.duanli.service;

import com.duanli.pojo.Schedule;
import com.duanli.util.R;

public interface ScheduleService {
    R getPage(int pageSize, int currentPage);

    R deleteSchedule(int id);

    R addSchedule(Schedule schedule);

    R updateSchedule(Schedule schedule);
}
