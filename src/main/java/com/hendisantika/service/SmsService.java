package com.hendisantika.service;

import com.hendisantika.model.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
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

    public String sendSms(SmsRequest smsRequest) {
        Message message = Message.creator(new PhoneNumber(smsRequest.getNumber()), new PhoneNumber(twilioProperties.getFromNumber()), smsRequest.getMessage()).create();
        return message.getStatus().toString();
    }
}
