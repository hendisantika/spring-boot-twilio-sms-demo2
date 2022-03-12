package com.hendisantika.controller;

import com.hendisantika.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
