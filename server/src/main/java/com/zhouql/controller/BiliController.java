package com.zhouql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王子周棋洛
 * @date 2024/3/21 22:45
 * 代理控制器
 */
@RestController
public class BiliController {
    @GetMapping("/")
    public String test() {
        return "初始化完成";
    }
}
