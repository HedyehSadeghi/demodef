package org.learning.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Scanner;

@Controller
@RequestMapping
public class ControllerDress {
    @GetMapping("/")
    public String home (Model model){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ciao");

        return "index";
    }
}
