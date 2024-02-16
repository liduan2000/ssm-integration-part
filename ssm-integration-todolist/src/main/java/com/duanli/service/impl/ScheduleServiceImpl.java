package com.duanli.service.impl;

import com.duanli.mapper.ScheduleMapper;
import com.duanli.pojo.Schedule;
import com.duanli.service.ScheduleService;
import com.duanli.util.PageBean;
import com.duanli.util.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    public R getPage(int pageSize, int currentPage) {
        PageHelper.startPage(currentPage, pageSize);
        List<Schedule> scheduleList = scheduleMapper.getAll();
        PageInfo<Schedule> pageInfo = new PageInfo<>(scheduleList);
        PageBean pageBean = new PageBean(currentPage, pageSize, pageInfo.getTotal(), pageInfo.getList());
        R r = R.ok(pageBean);
        return r;
    }

    @Override
    public R deleteSchedule(int id) {
        int rows = scheduleMapper.deleteById(id);
        if (rows > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R addSchedule(Schedule schedule) {
        int rows = scheduleMapper.add(schedule);
        if (rows > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R updateSchedule(Schedule schedule) {
        if (schedule.getId() == null) {
            return R.fail("id为空");
        }
        int rows = scheduleMapper.update(schedule);
        if (rows > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }
}
