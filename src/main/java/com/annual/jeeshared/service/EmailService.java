package com.annual.jeeshared.service;

import com.annual.jeeshared.constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;


@Service
public class EmailService {

    private static final Logger logger = LogManager.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender mailSender;


    public void sendCustomEmail(String[] to, String subject, String message) {
        logger.debug(String.format(Constants.SENDING_EMAIL,to));
        sendEmail(to, subject, message);
        logger.debug(String.format(Constants.EMAIL_SENT,to));
    }

    public void sendVerificationEmail(String to, String token) {
        String message = String.format(Constants.WELCOME_EMAIL_MESSAGE, Constants.APPLICATION_URL,
                token);
        logger.debug(String.format(Constants.SENDING_VERIFICATION_EMAIL,to));
        sendEmail(new String[] { to }, Constants.WELCOME_EMAIL_SUBJECT, message);
        logger.debug(String.format(Constants.VERIFICATION_EMAIL_SENT,to));
    }

    public void sendResetPasswordEmail(String to, String token) {
        String message = String.format(Constants.RESET_PASSWORD_EMAIL_MESSAGE,
                Constants.APPLICATION_URL, token);
        logger.debug(String.format(Constants.SENDING_RESET_PASSWORD_EMAIL,to));
        sendEmail(new String[] { to }, Constants.RESET_PASSWORD_EMAIL_SUBJECT, message);
        logger.debug(String.format(Constants.RESET_PASSWORD_EMAIL_SENT,to));
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
