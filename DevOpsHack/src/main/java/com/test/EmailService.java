package com.test;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.Test;

public class EmailService {


public void test(){String to = "gdmmadhan@yahoo.in";//change accordingly  
		String from = "ravi.paramasivam@gmail.com";//change accordingly  
		String host = "my-java-app.jigarthanda.cfapps.io";//or IP address  

		//Get the session object  
		Properties properties = System.getProperties();  
		properties.setProperty("mail.smtp.host", host);  
		Session session = Session.getDefaultInstance(properties);  

		//compose the message  
		try{  
		MimeMessage message = new MimeMessage(session);  
		message.setFrom(new InternetAddress(from));  
		message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
		message.setSubject("Ping");  
		message.setText("Hello, this is example of sending email  ");  

		// Send message  
		Transport.send(message);  
		System.out.println("message sent successfully....");  

		}catch (MessagingException mex) {mex.printStackTrace();}  
		
		}
    
}
