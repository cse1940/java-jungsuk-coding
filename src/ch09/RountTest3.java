package ch09;

import java.util.ArrayList;

public class RountTest3 {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); // list���� ��ü�� �߰� ������
        list.add(100); 
        
        Integer i = list.get(0); // list�� ����� ù ��° ��ü�� ����(�����Ϸ��� �ڵ� ��ȯ��)
//      int i = list.get(0).intValue(); -> ������ intValue()�� Integer�� int�� ��ȯ�ؾ� ��
    }

}
