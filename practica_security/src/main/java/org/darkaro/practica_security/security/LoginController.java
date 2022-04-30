package org.darkaro.practica_security.security;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    /*@RequestMapping(value = "/permiso", method = RequestMethod.GET)
    @ResponseBody
    public String welcomePage(Authentication authentication) {
        return "Bienvenido, tienes permisos de " + authentication.getName();
    }*/

    // URL: http://localhost:8080/
    @RequestMapping(value = "/zona/publica", method = RequestMethod.GET)
    @ResponseBody
    public String WelcomePagePublic() {
        return "[ZONA PUBLICA] Bienvenido, estás en la parte pública de la web";

    }

    // URL: http://localhost:8080/user
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String userPage(Authentication authentication) {
        return "[ZONA PRIVADA] Bienvenido a la sección de USER";
    }

    // URL: http://localhost:8080/user/test
    @RequestMapping(value = "/user/test", method = RequestMethod.GET)
    @ResponseBody
    public String userTest() {
        return "[ZONA PRIVADA] Bienvenido a TEST de la sección de USER";
    }

    // URL: http://localhost:8080/admin
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    @ResponseBody
    public String adminPage(Authentication authentication) {
        return "[ZONA PRIVADA] Bienvenido a la sección de " + authentication.getName();
    }

    // URL: http://localhost:8080/admin/test
    @RequestMapping(value = "/admin/test", method = RequestMethod.GET)
    @ResponseBody
    public String adminTest() {
        return "[ZONA PRIVADA] Bienvenido al apartado de TEST de la sección de USER";
    }


    // URL: http://localhost:8080/admin/shared
    @RequestMapping(value = "/shared", method = RequestMethod.GET)
    @ResponseBody
    public String sharedLoginPage(Authentication authentication) {
        return "[ZONA COMPARTIDA] Bienvenido a la sección accesible desde user y admin. Has iniciado sesión como: " + authentication.getName();
    }
}

