package com.example.demo.esp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EspController {


    @PostMapping("/emergencyCall")
    public void receiveCall(){
        System.out.println("dostalem zgloszenie");
    }
}
