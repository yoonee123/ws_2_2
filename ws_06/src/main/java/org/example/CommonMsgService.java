package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Lazy
// - 이 어노테이션을 사용하면 빈이 실제로 사용될 때까지 생성이 지연됩니다.
// - 리소스를 절약하고 성능을 향상시킬 수 있으며, 순환 참조 문제가 발생할 때 유용합니다.

// @Scope("prototype")
// - CommonMsgService가 프로토타입 스코프일 경우, 매번 요청할 때마다 새로운 인스턴스가 생성됩니다.
// - 싱글톤 스코프에서는 동일한 인스턴스가 주입되지만, 프로토타입 스코프에서는 각각의 요청에 대해 다른 인스턴스가 반환됩니다.

@Component
public class CommonMsgService {

    // @Qualifier("emailMsgSenderImpl")
    // @Autowired
    private final CommonMsgSender sender; // 메시지를 전송할 구현체

    // @Qualifier("fileMsgLoggerImpl")
    // @Autowired
    private final CommonMsgLogger logger; // 로그를 기록할 구현체

    // 기본 생성자 (주석 처리됨)
    // public CommonMsgService() {
    //     sender = new EmailMsgSenderImpl(); // 기본적으로 EmailMsgSenderImpl을 사용
    //     logger = new FileMsgLoggerImpl();   // 기본적으로 FileMsgLoggerImpl을 사용
    // }

    // 생성자에서 @Qualifier를 사용하여 주입받을 구현체를 명시합니다.
    public CommonMsgService(@Qualifier("emailMsgSenderImpl") CommonMsgSender sender,
                            @Qualifier("fileMsgLoggerImpl") CommonMsgLogger logger) {
        this.sender = sender; // 전송 구현체 주입
        this.logger = logger; // 로깅 구현체 주입
    }

    // 메시지를 전송하고 결과에 따라 로그를 기록하는 메서드
    public void SendMsg(String target, String msg) {
        int res = sender.SendMsgInner(target, msg); // 메시지 전송
        if(res == 1) {
            logger.InsertLog("성공메시지"); // 성공 로그 기록
        } else {
            logger.InsertLog("실패메시지"); // 실패 로그 기록
        }
    }
}
