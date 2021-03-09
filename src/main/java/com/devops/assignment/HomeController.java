package com.devops.assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping(value = "/greetings")
    public @ResponseBody String greetings() {
        return "Greetings from ING";
    }
}
