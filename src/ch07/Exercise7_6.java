package ch07;

class Outer4 { // �ܺ� Ŭ����
    class Inner { // ���� Ŭ����(�ν��Ͻ� Ŭ����)
        int iv = 100;
    }
}

public class Exercise7_6 {

    public static void main(String[] args) {
        
        Outer4 ou = new Outer4();
        Outer4.Inner ii = ou.new Inner();
        System.out.println(ii.iv);

    }

}
