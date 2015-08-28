package com.test;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailService1 {
    
    public static String sendEmail(String toEmail, String subject, String body) {

        /*final String userName = "info@catchmycity.com";
        final String passWord = "Strong123";
        String fromEmail = "info@catchmycity.com";
        Properties props = new Properties();
        props.put("mail.smtp.host", "vps.catchmycity.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.debug", "false");*/
        
        final String userName = "gdmmadhan@yahoo.in";
        final String passWord = "bluemount84";
        String fromEmail = "gdmmadhan@yahoo.in";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.mail.yahoo.com");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.debug", "true");
        Session session;
        session = Session.getDefaultInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, passWord);
            }
        });

        session.setDebug(false);
        MimeMessage message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(body);
            Transport.send(message);
            return "success";
        } catch (MessagingException e) {
            e.printStackTrace();
            return "failure";
        }
    }

    public void test() throws Exception{
    	String mailResult = sendEmail("gdmmadhan@yahoo.in", "subject", " body content");    	
    }
}
