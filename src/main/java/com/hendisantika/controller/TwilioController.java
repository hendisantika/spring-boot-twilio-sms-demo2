package com.hendisantika.controller;

import com.hendisantika.model.SmsRequest;
import com.hendisantika.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/03/22
 * Time: 19.02
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/")
public class TwilioController {

    @Autowired
    private SmsService smsService;

    @GetMapping
    public String homePage() {
        return "index";
    }

    @PostMapping("/sendmessage")
    public ResponseEntity<Object> sendMessage(SmsRequest smsRequest) {
        String status = smsService.sendSms(smsRequest);
        if ("sent".equals(status) || "queued".equals(status)) {
            return new ResponseEntity<Object>("sent successfully", HttpStatus.OK);
        }
        return new ResponseEntity<Object>("failed to send message", HttpStatus.NOT_FOUND);
    }
}
