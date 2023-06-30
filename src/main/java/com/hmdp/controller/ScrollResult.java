package com.hmdp.controller;

import lombok.Data;

import java.util.List;

@Data
public class ScrollResult {
    private List<?> lsit;
    private Long minTime;
    private Integer offset;
}
