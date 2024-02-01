package com.api.chatgpt.springboot.java.integration.model.response;

import com.api.chatgpt.springboot.java.integration.model.request.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Choice implements Serializable {
    private int index;
    private Message message;
}
