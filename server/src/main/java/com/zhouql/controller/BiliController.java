package com.zhouql.controller;

import cn.hutool.http.HttpUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王子周棋洛
 * @date 2024/3/21 22:45
 * 代理控制器
 */
@RestController
public class BiliController {
    /**
     * 移动端链接
     * @param url
     * @return
     */
    @GetMapping("/move")
    public String getMobileContent(@RequestParam("url") String url) {
        return HttpUtil.createGet(url).execute().body();
    }

    /**
     * 根据bv获取详细信息，其中avid和cid很重要
     * @param bv
     * @return
     */
    @GetMapping("/av/{bv}")
    public String getAv(@PathVariable("bv") String bv) {
        return HttpUtil.createGet("https://api.bilibili.com/x/web-interface/view?bvid=" + bv).execute().body();
    }

    /**
     * 根据avid和cid请求下载地址接口，获取视频地址
     * @param avid
     * @param cid
     * @return
     */
    @GetMapping("/download/{avid}/{cid}")
    public String getDownloadUrl(@PathVariable("avid") String avid, @PathVariable("cid") String cid) {
        return HttpUtil.createGet("https://api.bilibili.com/x/player/playurl?avid=" + avid + "&cid=" + cid + "&qn=80&type=mp4&platform=html5&high_quality=1").execute().body();
    }
}
