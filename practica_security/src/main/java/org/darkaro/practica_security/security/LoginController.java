package org.darkaro.practica_security.security;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String welcomePage(Authentication authentication) {
        return "Bienvenido, tienes permisos de " + authentication.getName();
    }
}
