package ch12;

public class Ex12_7 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation") // 컴파일러가 보여주는 경고메시지 억제
        Child c = new Child();
        c.parentMethod(); // Deprecated된 메서드 사용
    }
}

class Parent {
    void parentMethod() { }
}

class Child extends Parent {
    @Override
    @Deprecated
    void parentMethod() { }
}

@FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능함
interface Testable {
    void test(); // 추상메서드
//    void check(); -> 추상메서드
}