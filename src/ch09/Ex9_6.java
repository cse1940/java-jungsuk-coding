package ch09;

public class Ex9_6 {

    public static void main(String[] args) {
        
        String str1 = "abc"; // ���ڿ� ���ͷ� "abc"�� �ּҰ� str1�� �����
        String str2 = "abc"; // ���ڿ� ���ͷ� "abc"�� �ּҰ� str2�� �����
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");
        
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();
        
        String str3 = new String("abc"); // ���ο� String�ν��Ͻ��� ����
        String str4 = new String("abc"); // ���ο� String�ν��Ͻ��� ����
            
        System.out.println("String str3 = \"abc\";");
        System.out.println("String str4 = \"abc\";");
        
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));

    }

}

//  equals()�� ������� ���� �� ���ڿ��� ����("abc")�� ���ϱ� ������ �� ��� ��� true�� ����� ������,
//  String�ν��Ͻ��� �ּҸ� ��񱳿�����'=='�� ������ ���� ����� �ٸ���.
