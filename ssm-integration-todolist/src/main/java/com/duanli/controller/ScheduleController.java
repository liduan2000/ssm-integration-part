package com.duanli.controller;

import com.duanli.pojo.Schedule;
import com.duanli.service.ScheduleService;
import com.duanli.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin // 允许跨域访问
@RestController
@RequestMapping("schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/{pageSize}/{currentPage}")
    public R getPage(@PathVariable int pageSize, @PathVariable int currentPage) {
        R r = scheduleService.getPage(pageSize, currentPage);
        return r;
    }

    @DeleteMapping("{id}")
    public R deleteSchedule(@PathVariable int id) {
        R r = scheduleService.deleteSchedule(id);
        return r;
    }

    @PostMapping
    public R addSchedule(@RequestBody Schedule schedule) {
        R r = scheduleService.addSchedule(schedule);
        return r;
    }

    @PutMapping
    public R updateSchedule(@RequestBody @Validated Schedule schedule, BindingResult result) {
        if (result.hasErrors()) {
            return R.fail("参数错误");
        }
        R r = scheduleService.updateSchedule(schedule);
        return r;
    }
}
