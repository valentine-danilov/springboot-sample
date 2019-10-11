package by.danilov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

    @GetMapping("/form")
    public String getForm(ModelMap modelMap) {

        modelMap.addAttribute("key", "Hello");

        return "index";
    }
}
