package com.matrix.matrix_160_demo.service.impl;

import com.matrix.matrix_160_demo.dto.Email;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;

@Service
@RequiredArgsConstructor
public class EmailSenderService {
   private final JavaMailSender javaMailSender;
   private final TemplateEngine templateEngine;

   private final String myEmail = "rasulzade002@gmail.com";

   public void sendSimpleEmail(Email email) {
       SimpleMailMessage msg = new SimpleMailMessage();
       msg.setTo(email.getReceiver());
       msg.setFrom(myEmail);
       msg.setSubject(email.getSubject());
       msg.setText(email.getText());
       javaMailSender.send(msg);
       System.out.println("Successfully sent email.");
   }

   public void sendEmailWithAttachment(Email email) throws MessagingException {
       MimeMessage message = javaMailSender.createMimeMessage();
       MimeMessageHelper helper = new MimeMessageHelper(message, true);
       helper.setFrom(myEmail);
       helper.setTo(email.getReceiver());
       helper.setSubject(email.getSubject());
       helper.setText(email.getText());
       FileSystemResource file = new FileSystemResource(new File(email.getAttachmentPath()));
       helper.addAttachment(email.getFileName(), file);
       javaMailSender.send(message);
       System.out.println("Successfully sent email.");
   }


   public void sendEmailWithTemplate(Email email) throws MessagingException {
       Context context = new Context();
       context.setVariable("message", email.getText());

       MimeMessage mimeMessage = javaMailSender.createMimeMessage();
       MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
       helper.setTo(email.getReceiver());
       helper.setFrom(myEmail);
       helper.setSubject(email.getSubject());

       String htmlContent = templateEngine.process("email-test", context);
       helper.setText(htmlContent, true);

       javaMailSender.send(mimeMessage);
   }
}