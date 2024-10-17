package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan(basePackages = "org.example")
@Configuration
public class BeanConf {

    @Bean
    public CommonMsgService commonMsgService(@Qualifier("talkMsgSenderImpl") CommonMsgSender sender,
    @Qualifier ("fileMsgLoggerImpl") CommonMsgLogger logger) {
        CommonMsgService msgService
                = new CommonMsgService(sender, logger);
        return msgService;
    }
}
