package com.km.jmsdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {

    // Optional for sending message as json - it would be needed while sending using jms object
    private static final long serialVersionUID = 8224665291777878126L;

    private UUID id;
    private String message;
}
