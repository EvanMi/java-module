package com.yumi.renderer;

import org.yumi.data.Message;

public class SimpleRenderer {
    public void renderAsString(Message message) {
        System.out.println(processMessage(message));
    }
    private String processMessage(Message msg){
        return String.format("%n {Message= %s', Type= %s}",
                msg.getMessage(),
                msg.getType().toString());
    }
}