package by.danilov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController {

    @GetMapping("/form")
    public String getForm(ModelMap modelMap) {

        modelMap.addAttribute("key", "Hello");

        return "index";
    }

    /*Controller for handling form submit*/
    @PostMapping("/submit_form")
    public String submitForm(
            @RequestParam(
                    /*Value equals to input name on form*/
                    /*Also you can map params from form without @RequestParam */
                    /*In this case you just have to set method parameter name to input name from form*/
                    "number") Integer asd,
            /*Object to save request params after redirect*/RedirectAttributes redirectAttributes) {

        System.out.println(asd);

        /*As after redirect we lose all request params we need to pass RedirectAttributes to controller method*/
        /*This object saves all attributes that you put into it using addFlashAttributes method between redirects*/
        redirectAttributes.addFlashAttribute("result", "Here is passed param: " + asd);

        /*It is good practice to redirect after submitting using POST*/
        return "redirect:/form";

    }
}
