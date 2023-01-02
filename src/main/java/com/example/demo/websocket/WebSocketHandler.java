package com.example.demo.websocket;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;
import java.io.IOException;

public class WebSocketHandler extends AbstractWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String msg = String.valueOf(message.getPayload());
        // Send back unique message depending on the id received from the client
        System.out.println(msg);
    }

    @SendTo("/websocket")
    public void sendNotificationAboutEmergency(){

    }
}