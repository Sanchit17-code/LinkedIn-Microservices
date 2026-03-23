package com.example.linkedIn.connections_service.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;

public class kafkaTopicConfig {

    @Bean
    public NewTopic sendConnectionRequestTopic() {
        return new NewTopic("send-connection-request-topic", 3, (short) 1);
    }

    @Bean
    public NewTopic acceptConnectionRequestTopic() {
        return new NewTopic("accept-connection-request-topic", 3, (short) 1);
    }
}
