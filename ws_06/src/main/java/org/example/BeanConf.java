package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 스프링의 컴포넌트 스캔을 통해 org.example 패키지 내의 빈을 자동으로 검색 및 등록합니다.
@ComponentScan(basePackages = "org.example")
@Configuration
public class BeanConf {

    // @Bean 어노테이션을 사용하여 EmailMsgSenderImpl을 빈으로 등록합니다.
    // 이 부분은 주석 처리되어 있으므로 현재 코드에서는 사용되지 않습니다.
    // @Bean
    // public EmailMsgSenderImpl emailMsgSender() {
    //     return new EmailMsgSenderImpl();
    // }

    // @Bean 어노테이션을 사용하여 FileMsgLoggerImpl을 빈으로 등록합니다.
    // 이 부분도 주석 처리되어 현재 사용되지 않습니다.
    // @Bean
    // public FileMsgLoggerImpl fileMsgLogger() {
    //     return new FileMsgLoggerImpl();
    // }

    // talkMsgService 빈을 생성하는 메서드입니다.
    // @Qualifier를 사용하여 talkMsgSenderImpl과 fileMsgLoggerImpl 구현체를 주입받습니다.
    // 이를 통해 CommonMsgService 객체가 두 가지 의존성을 갖게 됩니다.
    @Bean
    public CommonMsgService talkMsgService(@Qualifier("talkMsgSenderImpl") CommonMsgSender sender,
                                           @Qualifier("fileMsgLoggerImpl") CommonMsgLogger logger) {
        // CommonMsgService 객체를 생성하고, 주입받은 sender와 logger를 설정합니다.
        CommonMsgService msgService = new CommonMsgService(sender, logger);
        return msgService; // 생성된 msgService 객체를 반환합니다.
    }

    // emailMsgService 빈을 생성하는 메서드입니다.
    // @Qualifier를 사용하여 emailMsgSenderImpl과 fileMsgLoggerImpl 구현체를 주입받습니다.
    // 이를 통해 CommonMsgService 객체가 두 가지 의존성을 갖게 됩니다.
    @Bean
    public CommonMsgService emailMsgService(@Qualifier("emailMsgSenderImpl") CommonMsgSender sender,
                                            @Qualifier("fileMsgLoggerImpl") CommonMsgLogger logger) {
        // CommonMsgService 객체를 생성하고, 주입받은 sender와 logger를 설정합니다.
        CommonMsgService msgService = new CommonMsgService(sender, logger);
        return msgService; // 생성된 msgService 객체를 반환합니다.
    }
}
