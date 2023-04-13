package com.yumi.support;

import com.yumi.renderer.SimpleRenderer;
import org.yumi.data.Message;

import static org.yumi.data.type.Type.*;

public class RendererSupport {
    private Message message = new Message();

    public void render(String message) {
        this.message.setMessage(message);
        this.message.setType(STRING);
        new SimpleRenderer().renderAsString(this.message);
    }

    public Message getCurrentMessage() {
        return this.message;
    }
}