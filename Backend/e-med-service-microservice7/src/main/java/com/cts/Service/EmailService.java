package com.cts.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cts.model.Email;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendEmail(Email email)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("emedexpress309@gmail.com");
		message.setTo(email.getToEmail());
		message.setText(email.getBody());
		message.setSubject(email.getSubject());
		
		mailSender.send(message);
		
		System.out.println("Mail Sent successfully....");
	}
}
