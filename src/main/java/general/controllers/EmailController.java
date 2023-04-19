package general.controllers;

import general.mail.EmailDetails;
import general.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestBody EmailDetails emailDetails) {
        return emailService.sendSimpleMail(emailDetails);
    }
    @PostMapping("/sendEmailWithAttach")
    public String sendEmailWithAttach(@RequestBody EmailDetails emailDetails) {
        return emailService.sendMailWithAttachment(emailDetails);
    }

}
