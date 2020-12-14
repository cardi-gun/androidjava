package com.mega.mvc05;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Aspect
@Service("mail")
public class Mailservice {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void mailSend(HttpServletRequest request) {
		System.out.println(request.getParameter("tomail"));
		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("content"));
		
		
		try {
			//MIMEMessage 객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			//messager안에 값을 넣어야하는데, vo같은 클래스 객체를 만들어서 
			//값을 넣어주도록 한다.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,"UTF-8");
			messageHelper.setFrom("chus0429@gmail.com");
			messageHelper.setTo(request.getParameter("tomail"));
			messageHelper.setSubject(request.getParameter("title"));
			messageHelper.setText(request.getParameter("content"));
			mailSender.send(message);
			System.out.println("메일을 보냈습니다. ");
		} catch (Exception e) {
			System.out.println("메일 보내는중 에러 발생 >>>" + e);
		}

	}

	public void mailSend2(JoinPoint joinPoint, Throwable ex) {
		Signature signature = joinPoint.getSignature();
		System.out.println(joinPoint.getSignature());
		System.out.println(signature.getName());
		System.out.println(signature.toString());
		
		System.out.println("에러정보 : " + ex.getMessage());
		System.out.println("에러발생하여 메서드 호출됨");
		try {
			//MIMEMessage 객체 생성
			MimeMessage message = mailSender.createMimeMessage();
			//messager안에 값을 넣어야하는데, vo같은 클래스 객체를 만들어서 
			//값을 넣어주도록 한다.
			MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,"UTF-8");
			messageHelper.setFrom("chus0429@gmail.com");
			messageHelper.setTo("aliciawill@naver.com");
			messageHelper.setSubject(signature.getName()+"서버에 문제발생");
			messageHelper.setText("문제가 발생했습니다.");
			
			mailSender.send(message);
			System.out.println("메일을 보냈습니다. ");
		} catch (Exception e) {
			System.out.println("메일 보내는중 에러 발생 >>>" + e);
		}
		
		
	}


}
