package ch07;

class Outer5 { // �ܺ� Ŭ����
    static class Inner { // ���� Ŭ����(staticŬ����)
        int iv = 200;
    }
}

public class Exercise7_7 {

    public static void main(String[] args) {
        
        Outer5.Inner ii = new Outer5.Inner();
        System.out.println(ii.iv);
        

    }

}
