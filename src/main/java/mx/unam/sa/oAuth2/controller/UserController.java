package mx.unam.sa.oAuth2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/home")
    public String sayHello(Authentication authentication, Model model) {
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "home";
    }
    
}
