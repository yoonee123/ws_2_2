package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        CommonMsgService commonMsgService
//                = new CommonMsgService(new EmailMsgSenderImpl(), new FileMsgLoggerImpl());

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);
        CommonMsgService commonMsgService = context.getBean("talkMsgService", CommonMsgService.class);
        CommonMsgService commonMsgService2 = context.getBean("emailMsgService", CommonMsgService.class);

        commonMsgService.SendMsg("홍길동", "회원가입을 환영합니다.");

        // 빈 비교
        if(commonMsgService.equals(commonMsgService2)) {
            System.out.println("같은객체");
        }
        else{
            System.out.println("다른객체");
        }
    }
}