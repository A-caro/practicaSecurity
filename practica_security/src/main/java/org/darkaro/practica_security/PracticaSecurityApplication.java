package org.darkaro.practica_security;

import org.darkaro.practica_security.security.PracticaSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@SpringBootApplication
//importamos la clase que contendrá todo lo referente a las contraseñas
@Import({ PracticaSecurity.class })
public class PracticaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticaSecurityApplication.class, args);
    }

}
