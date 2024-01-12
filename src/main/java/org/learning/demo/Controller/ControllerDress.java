package org.learning.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControllerDress {
    @GetMapping("/")
    public String home (Model model){
        System.out.println("ciao");
        return "home";
        //matteo ti puzza il culo
    }
}
