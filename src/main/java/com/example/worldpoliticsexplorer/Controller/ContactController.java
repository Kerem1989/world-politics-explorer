package com.example.worldpoliticsexplorer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/sendEmail")
    public ResponseEntity<String> sendEmail(@RequestParam("name") String name,
                                            @RequestParam("email") String email,
                                            @RequestParam("subject") String subject,
                                            @RequestParam("message") String message) {
        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo("kerem.tazedal.89@gmail.com");
            mailMessage.setSubject("New Contact Form Submission: " + subject);
            mailMessage.setText("You have received a new message from your website contact form.\n\n" +
                    "Here are the details:\n\n" +
                    "Name: " + name + "\n" +
                    "Email: " + email + "\n\n" +
                    "Message:\n" + message);

            mailSender.send(mailMessage);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("error");
        }
    }
}


