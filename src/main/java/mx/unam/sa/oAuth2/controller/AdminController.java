package mx.unam.sa.oAuth2.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class AdminController {
    
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/")
    public String getUsers() {
        

        return "users";
    }
}
