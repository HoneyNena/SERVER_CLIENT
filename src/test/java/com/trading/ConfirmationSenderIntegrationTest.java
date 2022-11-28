package com.trading;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@Configuration
public class ConfirmationSenderIntegrationTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private RabbitTemplate template;

    @Before
    public void setUp() throws Exception {
        ConfirmationSenderApplication.main(new String[] {});
        setupRabbitMq();
    }

    private void setupRabbitMq() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setUri("amqp://guest:guest@localhost");

        template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(new Jackson2JsonMessageConverter());
    }

    @Test
    public void receives_enriched_allocation_and_sends_confirmation() throws Excep