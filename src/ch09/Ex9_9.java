package ch09;

import java.util.StringJoiner; // ���ڿ� �����ϴ� Ŭ����

public class Ex9_9 {

    public static void main(String[] args) {
        
        String animals = "dog,cat,bear";
        String[] arr = animals.split(","); // ���ڿ��� ','�� �����ڷ� ������ �迭�� ����
        
        System.out.println(String.join("-", arr)); // �迭�� ���ڿ��� '-'�� �����ؼ� ����
        
        StringJoiner sj = new StringJoiner("/", "[", "]");
        
        for(String s : arr)
            sj.add(s);
        
        System.out.println(sj.toString());

    }

}
