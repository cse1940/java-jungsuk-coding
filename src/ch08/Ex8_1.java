package ch08;

public class Ex8_1 { // try�� ������ ���ܰ� �߻����� ���� ���,
//                      catch���� ��ġ�� �ʰ� ��ü try-catch���� ���������� ������ ����Ѵ�

    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch(Exception e) {
            System.out.println(4); // ������� �ʴ´�.
        } // try-catch�� ��
        System.out.println(5);
    }

}
