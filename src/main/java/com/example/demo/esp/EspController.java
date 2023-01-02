package com.example.demo.esp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EspController {


    @PostMapping("/emergencyCall")
    public void receiveCall(@RequestBody String body){
        System.out.println("dostalem zgloszenie od "+ body);
    }
}
