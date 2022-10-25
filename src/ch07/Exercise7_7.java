package ch07;

class Outer5 { // 외부 클래스
    static class Inner { // 내부 클래스(static클래스)
        int iv = 200;
    }
}

public class Exercise7_7 {

    public static void main(String[] args) {
        
        Outer5.Inner ii = new Outer5.Inner();
        System.out.println(ii.iv);
        

    }

}
