package com.duanli.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * description: 任务实体类
 */
@Data
public class Schedule {
    private Integer id;
    @NotBlank
    private String title;
    @NotNull
    private Boolean completed;
}
