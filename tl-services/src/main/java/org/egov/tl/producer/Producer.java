package org.egov.tl.producer;

import lombok.extern.slf4j.Slf4j;

import org.egov.tl.web.models.EmailRequest;
import org.egov.tracer.kafka.CustomKafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Producer {

    @Autowired
    private CustomKafkaTemplate<String, Object> kafkaTemplate;
    
    public void push(String topic, Object value) {
        kafkaTemplate.send(topic, value);
    }
    
    public void pushEmail(String emailTopic, String emailAddress, String message, String subject, Boolean isHTML) {
        //kafkaTemplate.send(topic, value);
    	final EmailRequest emailMessage = EmailRequest.builder()
				.body(message)
				.subject(subject)
				.email(emailAddress)
				.isHTML(isHTML)
				.build();
		kafkaTemplate.send(emailTopic, emailMessage);
    }
}
