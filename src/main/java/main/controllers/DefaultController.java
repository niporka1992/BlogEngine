package main.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
public class DefaultController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
}
