package com.notifier.mailsender.services;

import com.notifier.mailsender.configurations.EmailConfigs;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

    public void sendEmail(String host, String username, String password, String to, String subject, String text) {

        EmailConfigs emailConfigs = new EmailConfigs();

        emailConfigs.setHost(host);
        emailConfigs.setUsername(username);
        emailConfigs.setPassword(password);

        JavaMailSender javaMailSender = emailConfigs.javaMailSender();

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        javaMailSender.send(message);
    }
}
