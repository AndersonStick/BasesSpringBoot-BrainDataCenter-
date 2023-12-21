package com.example.TutorialSpringBoot1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControllerREST {

    @GetMapping("/")
    public String start(){
        log.info("Estoy ejecutando el controlador REST");

        return "Hola mundo en SpringBoot";
    }
}
