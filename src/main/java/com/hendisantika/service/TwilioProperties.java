package com.hendisantika.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-twilio-sms-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/03/22
 * Time: 18.59
 * To change this template use File | Settings | File Templates.
 */
@Data
@Configuration
@ConfigurationProperties("twilio")
@AllArgsConstructor
@NoArgsConstructor
public class TwilioProperties {
    private String accountSid;
    private String authToken;
    private String fromNumber;
}
