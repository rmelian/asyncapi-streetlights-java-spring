package com.asyncapi.streetlights.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

/**
 * @author Raisel Melian raisel.melian@gmail.com
 */
@MessagingGateway
public interface AmqpMyGateway {

    @Gateway(requestChannel = "amqpOutboundChannel")
    void sendToRabbit(String data);
}
