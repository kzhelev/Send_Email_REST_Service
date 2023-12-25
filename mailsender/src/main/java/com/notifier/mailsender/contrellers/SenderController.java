package com.notifier.mailsender.contrellers;

import com.notifier.mailsender.models.dto.MailDto;
import com.notifier.mailsender.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    private EmailService emailService;

    @Autowired
    public SenderController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping(value = "/send-email", consumes = "application/json")
    public void sendEmail(@RequestBody MailDto mailDto){
        emailService.sendEmail(mailDto.getHost(), mailDto.getUsername(), mailDto.getPassword(), mailDto.getSendTo(),mailDto.getObject(), mailDto.getBody());
    }
}
