package com.matrix.matrix_160_demo.controller;

import com.matrix.matrix_160_demo.dto.Email;
import com.matrix.matrix_160_demo.service.impl.EmailSenderService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("e-mail")
public class EmailController {
    private final EmailSenderService emailSenderService;

    @PostMapping
    public void send(@RequestBody Email email){
        emailSenderService.sendSimpleEmail(email);
    }

    @PostMapping("template")
    public void sendWithTemplate(@RequestBody Email email) throws MessagingException {
        emailSenderService.sendEmailWithTemplate(email);
    }
}
