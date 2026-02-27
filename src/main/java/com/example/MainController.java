package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/greeting")
    public String greet(@RequestParam("getMsgs") String msg, Model model){
        String gmsg=msg+ "Welcome!";
        System.out.println("hello"+gmsg);
        model.addAttribute("greetMsg",gmsg);
        return "greet";
    }

    @RequestMapping("/user")
    public Model user(Model model){
        UserDto user = UserDto.builder()
                .name("Spring MVC")
                .email("abcd@gmail.com")
                .build();

        model.addAttribute("userData",user);
        return model;
    }
}

