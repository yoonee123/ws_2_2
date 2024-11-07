package org.example;

public class TestClass {

    // TestClass의 유일한 인스턴스를 저장하기 위한 정적 필드
    private static TestClass instance;

    // TestClass의 인스턴스를 반환하는 정적 메서드
    public static TestClass getInstance() {
        // 인스턴스가 아직 생성되지 않았다면
        if(TestClass.instance == null) {
            // 새로운 TestClass 객체를 생성하여 instance에 할당
            TestClass.instance = new TestClass();
        }
        // 항상 같은 인스턴스를 반환
        return TestClass.instance;
    }

    // 생성자를 private으로 설정하여 외부에서 직접 인스턴스를 생성할 수 없도록 함
    private TestClass() {
        // 초기화 작업을 수행할 수 있는 생성자
    }

}
