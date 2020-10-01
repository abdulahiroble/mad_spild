package com.madspild.madspild.controller;
import com.madspild.madspild.models.MadSpild;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @ResponseBody
    public String madSpildTid() {

        return "madspildITal";
    }

    @GetMapping("/hkdg")
    public String hvadKanDuGøre() {

        return "hvadKanDuGøre";
    }

    @GetMapping("/kontakt")
    @ResponseBody
    public String Kontakt() {

        return "kontakt";
    }


}
