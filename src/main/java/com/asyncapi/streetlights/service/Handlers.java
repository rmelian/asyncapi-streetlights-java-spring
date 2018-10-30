package com.asyncapi.streetlights.service;

import com.asyncapi.streetlights.infrastructure.Bindings;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author Raisel Melian raisel.melian@gmail.com
 */
@Component
public class Handlers {

    @StreamListener(Bindings.INPUT)
    public void handle(String lightMeasured) {
        System.out.println("Received: " + lightMeasured);
    }

}
