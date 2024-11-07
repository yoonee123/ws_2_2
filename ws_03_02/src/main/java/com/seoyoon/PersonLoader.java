package com.seoyoon;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.seoyoon")
// 컴포넌트 스캔: com.seoyoon 패키지 내의 @Component가 붙은 모든 클래스를 빈으로 자동 등록
// 예를 들어, Person 클래스에 @Component가 붙어 있기 때문에 스프링이 자동으로 인식하여 관리함
@Configuration
public class PersonLoader {
    // @Configuration 애노테이션이 붙은 클래스는 스프링 컨테이너가 초기화될 때
    // @Bean 메소드를 호출하여 빈을 생성하는 데 사용됨
    // 하지만 여기서는 빈을 정의하지 않고, 오히려 컴포넌트 스캔을 통해 빈을 자동으로 등록하는 역할을 함

    // 추가적인 빈을 정의할 필요가 없는 경우 이와 같이 설정만으로도 충분
    // 코드의 간결성을 유지하고, 개발자가 관리해야 할 빈의 수를 줄임
}
