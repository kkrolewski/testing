package com.example.demo.esp;

import com.example.demo.websocket.WebSocketHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class EspController {

    @PostMapping("/emergencyCall")
    public void receiveCall(@RequestBody String body){
        System.out.println("Received call from "+ body);
        try{
        WebSocketHandler.sendEmergencyMessage("Received call from " + body);}
        catch(IOException e){
            System.out.println("error");
        }
    }

}
