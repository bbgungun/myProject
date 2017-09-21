package com.ssm.maven.core.utils;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailUtils {
	public static void sendMail(String to,String address,String name){
		Properties properties = System.getProperties();// 获取系统属性
		properties.setProperty("mail.smtp.host",  "smtp.qq.com");// 设置邮件服务器
		properties.setProperty("mail.smtp.auth", "true");// 打开认证
		try {
			MailSSLSocketFactory sf = new MailSSLSocketFactory();
			sf.setTrustAllHosts(true);
			properties.put("mail.smtp.ssl.enable", "true");
			properties.put("mail.smtp.ssl.socketFactory", sf);
			Session session=Session.getInstance(properties, new Authenticator(){
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("395155790@qq.com","avibconfrukebjje");
					}
				});
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("395155790@qq.com"));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("来自"+ name +"的同学录");
			String content="<h1>来自"+ name +"的同学录，点击链接进入</h1><h3><a href='"+address+"'>"+address+"</a></h3>";
			message.setContent(content, "text/html;charset=UTF-8");
			Transport.send(message);
			System.out.println("邮件成功发送!");
		} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
