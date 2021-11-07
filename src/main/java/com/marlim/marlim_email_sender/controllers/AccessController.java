package com.marlim.marlim_email_sender.controllers;

import java.util.List;

import javax.mail.internet.MimeMessage;

import com.marlim.marlim_email_sender.models.EmailTemplate;
import com.marlim.marlim_email_sender.models.EmailTextTemplates;
import com.marlim.marlim_email_sender.models.MarlimAccess;
import com.marlim.marlim_email_sender.services.AccessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
public class AccessController {

    @Autowired
    private AccessService service;

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping(path = "/access")
    public ResponseEntity<?> getAllAccess() {
        List<MarlimAccess> allAccess = service.getAllAccess();
        return ResponseEntity.ok().body(allAccess);
    }

    @PostMapping(path = "/access")
    public ResponseEntity<?> addAccess(@RequestBody MarlimAccess entry) {
        MarlimAccess access = service.addAccess(entry);
        return ResponseEntity.ok().body(access);
    }

    @PostMapping(path = "/sendemail")
    public ResponseEntity<?> sendEmail(@RequestBody EmailTemplate emailTemplate) {
        if (emailTemplate.isOffer()) emailTemplate.setText(EmailTextTemplates.clickable);
        try {
            if (emailTemplate.getSubject().isEmpty()) return ResponseEntity.badRequest().body("Empty subject");
            if (emailTemplate.getText().isEmpty()) return ResponseEntity.badRequest().body("Empty message");

            MimeMessage msg = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(msg, true);
            helper.setTo(emailTemplate.getTo());
            helper.setSubject(emailTemplate.getSubject());
            helper.setText(emailTemplate.getText(), true);
            javaMailSender.send(msg);

            return ResponseEntity.ok().body("Success");

        } catch (Exception e) {
            return ResponseEntity.badRequest().body(String.format("Failed to send the email: %s", e.getMessage()));
        }
    }
}
