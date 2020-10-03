package com.madspild.madspild.controller;
import com.madspild.madspild.services.MadspildCounterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    MadspildCounterService madspildService = new MadspildCounterService();

    @GetMapping("/")
    public String index(Model viewModel) {
        viewModel.addAttribute("foodWaste", madspildService.calcFoodWaste());
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
