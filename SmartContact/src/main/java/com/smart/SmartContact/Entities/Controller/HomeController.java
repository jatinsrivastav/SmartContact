package com.smart.SmartContact.Entities.Controller;

import com.smart.SmartContact.Entities.User;
import com.smart.SmartContact.Entities.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public  String home(Model model){
        model.addAttribute("title","this is title");


        return "home";
    }

    @GetMapping("/login")
    public  String login(Model model)
    {
        return "login";
    }

    @GetMapping("/about")
    public  String about(Model model){
        model.addAttribute("title","this is title");


        return "about";
    }

    @GetMapping("/signup")
    public  String signup(Model model){
        model.addAttribute("title","this is title");
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/do_register")
    public String do_register(@ModelAttribute("user") User user,Model model){
        System.out.println("User"+user);

        return "signup";
    }
}
