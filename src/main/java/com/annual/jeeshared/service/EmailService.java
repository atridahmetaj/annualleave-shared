package com.annual.jeeshared.service;

import com.annual.jeeshared.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;


@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;


    public void sendCustomEmail(String[] to, String subject, String message) {
        sendEmail(to, subject, message);
    }

    public void sendVerificationEmail(String to, String token) {
        String message = String.format(Constants.WELCOME_EMAIL_MESSAGE, Constants.APPLICATION_URL,
                token);
        sendEmail(new String[] { to }, Constants.WELCOME_EMAIL_SUBJECT, message);
    }

    public void sendResetPasswordEmail(String to, String token) {
        String message = String.format(Constants.RESET_PASSWORD_EMAIL_MESSAGE,
                Constants.APPLICATION_URL, token);
        sendEmail(new String[] { to }, Constants.RESET_PASSWORD_EMAIL_SUBJECT, message);
    }

    private void sendEmail(String[] to, String subject, String message) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(message);

        mailSender.send(mailMessage);
    }

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("annualleavelhind@gmail.com");
        mailSender.setPassword("lhind2021!");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }

}
