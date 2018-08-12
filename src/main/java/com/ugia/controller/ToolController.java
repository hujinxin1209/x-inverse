package com.ugia.controller;

import com.ugia.common.ServerResponse;
import com.ugia.pojo.ShuDu;
import com.ugia.service.IToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    IToolService iToolService;

    @RequestMapping("shuducal")
    @ResponseBody
    public ServerResponse<Integer[][]> shuDuCalculate(ShuDu shuDu) {
        return iToolService.shuDuCalculate(shuDu);
    }

    @RequestMapping("encode")
    @ResponseBody
    public ServerResponse<String> encode(String origin, String algorithm) {
        return iToolService.encode(origin, algorithm);
    }

    @RequestMapping("uuid")
    @ResponseBody
    public ServerResponse<String> uuid() {
        return iToolService.UUID();
    }
}