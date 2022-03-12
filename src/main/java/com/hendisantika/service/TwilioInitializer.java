package com.hendisantika.service;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/03/22
 * Time: 18.58
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class TwilioInitializer {
    private final TwilioProperties twilioProperties;

    public TwilioInitializer(TwilioProperties twilioProperties) {
        this.twilioProperties = twilioProperties;
        Twilio.init(twilioProperties.getAccountSid(), twilioProperties.getAuthToken());
        System.out.println("twilio intialized with account: " + twilioProperties.getAccountSid());
    }
}
