package com.asyncapi.streetlights.infrastructure;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Raisel Melian raisel.melian@gmail.com
 */
public interface Bindings {
    String INPUT = "input";

    @Input(Bindings.INPUT)
    SubscribableChannel input();
}
