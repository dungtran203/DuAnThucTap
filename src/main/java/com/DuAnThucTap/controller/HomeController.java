package com.DuAnThucTap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/psg")
public class HomeController {

    @GetMapping("/layout")
    public String hoaDon(){
        return "user/san_pham";
    }
}
