package com.test;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailService1 {
    private static final String SMTP_HOST_NAME = "smtp.mail.yahoo.com";
    private static final int SMTP_HOST_PORT = 587;//465,587,25
    private static final String SMTP_AUTH_USER = "gdmmadhan@yahoo.com";
    private static final String SMTP_AUTH_PWD  = "bluemount84";

    public void test() throws Exception{
	
    	
        Properties props = new Properties();

        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        // props.put("mail.smtps.quitwait", "false");

        Session mailSession = Session.getDefaultInstance(props);
        mailSession.setDebug(true);
        Transport transport = mailSession.getTransport();

        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject("Testing SMTP-SSL");
        message.setContent("This is a test", "text/plain");

        message.addRecipient(Message.RecipientType.TO,
             new InternetAddress("gdmmadhan@yahoo.in"));

        transport.connect
          (SMTP_HOST_NAME, SMTP_HOST_PORT, SMTP_AUTH_USER, SMTP_AUTH_PWD);

        transport.sendMessage(message,
            message.getRecipients(Message.RecipientType.TO));
        transport.close();
    }
}
