package com.ty.backpackers.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.ty.backpackers.dto.User;

@Component
public class SendEmail {
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendSimpleEmail(String body, String toEmail, String subject) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("kathick.p2210@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		javaMailSender.send(message);
	}
	
	public void sendOTP() {
		
		
		
    	int   OTP  = (int)Math.random()*(400-900)+400;
		
		User user =  new User();
		
		
		
		
	}

}
