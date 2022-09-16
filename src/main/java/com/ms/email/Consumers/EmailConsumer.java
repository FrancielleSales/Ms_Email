package com.ms.email.Consumers;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import com.ms.email.services.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Slf4j
@Component
public class EmailConsumer {

    @Autowired
    EmailService emailService;

    @RabbitListener(queues="${spring.rabbitmq.queue}")
    public void listen(@Valid @Payload EmailDto emailDto){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        log.info("Email Status: " + emailModel.getStatusEmail().toString());
    }
}
