package com.madspild.madspild.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "index";

    }

    @GetMapping("/homePage")
    @ResponseBody
    public String homePage() {
        return "frontPage";

    }

    @GetMapping("/mt")
    @ResponseBody
    public String madSpildTid() {
        return "Mad Spild i tid";
    }

    @GetMapping("/hkdg")
    @ResponseBody
    public String hvadKanDuGøre() {
        return "Dette kan du gøre";
    }

    @GetMapping("/kontakt")
    @ResponseBody
    public String Kontakt() {
        return "Kontakt";
    }


}
