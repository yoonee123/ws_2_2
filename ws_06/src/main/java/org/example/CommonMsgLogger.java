package org.example;

public interface CommonMsgLogger {
    void InsertLog(String msg);
}

//인터페이스 CommonMsgSender와 CommonMsgLogger는 메시지를 보내고 로깅하는 공통 동작을 정의하고 있습니다.
//각기 다른 전송 방식과 로깅 방식의 클래스들(EmailMsgSenderImpl, TalkMsgSenderImpl, FileMsgLoggerImpl, DbMsgLoggerImpl 등)을
//이 인터페이스로 구현하여 다양한 메시지 전송과 로깅 방법을 제공할 수 있게 설계되었습니다.