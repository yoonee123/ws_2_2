package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 순수 자바를 사용한 CommonMsgService 인스턴스 생성 예시 (주석 처리됨)
        // CommonMsgService commonMsgService
        //         = new CommonMsgService(new EmailMsgSenderImpl(), new FileMsgLoggerImpl());

        // 스프링 컨텍스트를 사용하여 빈을 관리합니다.
        // AnnotationConfigApplicationContext는 @Configuration 애노테이션이 붙은 클래스를 기반으로 스프링 컨텍스트를 초기화합니다.
        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConf.class);

        // talkMsgService 빈을 가져와서 commonMsgService 변수에 할당합니다.
        CommonMsgService commonMsgService = context.getBean("talkMsgService", CommonMsgService.class);

        // emailMsgService 빈을 가져와서 commonMsgService2 변수에 할당합니다.
        CommonMsgService commonMsgService2 = context.getBean("emailMsgService", CommonMsgService.class);

        // commonMsgService를 통해 메시지를 전송합니다.
        commonMsgService.SendMsg("홍길동", "회원가입을 환영합니다.");

        // commonMsgService2를 통해 다른 메시지를 전송합니다.
        commonMsgService2.SendMsg("홍길동", "회원가입을 환영합니다.");

        // 빈 비교: commonMsgService와 commonMsgService2가 동일한 인스턴스인지 확인합니다.
        if(commonMsgService.equals(commonMsgService2)) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }

        // 위 비교 결과에 대한 설명:
        // service1과 service2가 동일한 인스턴스라는 의미는, == 연산자로 비교할 때도 같은 객체로 인식된다는 뜻입니다.
        // 두 변수가 참조하는 메모리 주소가 동일하기 때문입니다.
        // 위 코드가 실행되면 "같은 객체"가 출력되며,
        // 이는 Spring이 싱글톤 스코프를 사용해 두 번의 요청에도 동일한 객체를 재사용했기 때문입니다.
    }
}
