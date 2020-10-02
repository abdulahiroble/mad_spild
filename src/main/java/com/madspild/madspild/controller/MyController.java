package com.madspild.madspild.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    public String index() {
        return "index";

    }

    @GetMapping("/mt")
    public String madSpildTid() {
        return "madspildITal";
    }

    @GetMapping("/hkdg")
    public String hvadKanDuGøre() {


        return "hvadKanDuGøre";
    }

    @GetMapping("/kontakt")
    public String Kontakt() {

        return "kontakt";
    }

    @GetMapping("/henvendelse")
    public String Henvendelse() {

        return "takforhenvendelse";
    }


}
