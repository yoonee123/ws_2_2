package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "org.example")  // 패키지 이름을 실제 패키지로 변경
public class BeanConf {
    // 추가적인 설정이 필요하다면 여기에 작성
}
