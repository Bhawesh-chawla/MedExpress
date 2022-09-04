package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.Service.EmailService;
import com.cts.model.Email;

@RestController
@CrossOrigin
public class EmailSenderController {
	
	@Autowired
	private EmailService senderService;
	
	@PostMapping("/sendEmail")
	public void sendMail(@RequestBody Email email)
	{
		senderService.sendEmail(email);
		System.out.println("Mail sent successfully");
	}

}