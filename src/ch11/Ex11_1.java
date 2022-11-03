package ch11;

import java.util.*;

public class Ex11_1 {

    public static void main(String[] args) {

//      �⺻ ����(�뷮, capacity)�� 10�� ArrayList�� ����
        ArrayList list1 = new ArrayList(10);
//      ArrayList���� ��ü�� ���� �����ϴ�.
//      autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ��
        list1.add(new Integer(5)); 
//      list1.add(5);
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        
        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 4, 2, 0
        print(list1, list2);
        
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);
        
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
        
        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // index�� 3�� ���� "A"�� �߰�
        print(list1, list2);
        
        list2.set(3, "AA"); // index�� 3�� ���� "AA"�� ����
        print(list1, list2);
        
        list1.add(0, "1");
//      indexOf()�� ������ ��ü�� index�� �˷��ش�.
        System.out.println("index=" + list1.indexOf("1")); // 0
        System.out.println("index=" + list1.indexOf(1));   // 2
        list1.remove(0); // index�� 0�� ��ü�� ������
//      list1.remove(new Integer(0)); -> 0�� ������
        print(list1, list2);
        
//      list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.(������)
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);
        
//      list2���� list1�� ���Ե� ��ü���� �����Ѵ�.(������)
        for(int i=list2.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i); // index�� i�� ���� ����� ��Ҹ� ����
        }
        print(list1, list2);
    }
    
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }

}
