package com.loaction.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailImpl implements Email {
	@Autowired
    private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String toAddress, String subject, String emailBody) {
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(toAddress);

        msg.setSubject(subject);
        msg.setText(emailBody);

        javaMailSender.send(msg);

	}

}
