package com.hendisantika.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/03/22
 * Time: 19.03
 * To change this template use File | Settings | File Templates.
 */
@Service
public class SmsService {
    private final TwilioProperties twilioProperties;

    @Autowired
    public SmsService(TwilioProperties twilioProperties) {
        this.twilioProperties = twilioProperties;
    }
}
