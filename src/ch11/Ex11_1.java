package ch11;

import java.util.*;

public class Ex11_1 {

    public static void main(String[] args) {

//      기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
//      ArrayList에는 객체만 저장 가능하다.
//      autoboxing에 의해 기본형이 참조형으로 자동 변환됨
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
        list2.add(3, "A"); // index가 3인 곳에 "A"를 추가
        print(list1, list2);
        
        list2.set(3, "AA"); // index가 3인 곳을 "AA"로 변경
        print(list1, list2);
        
        list1.add(0, "1");
//      indexOf()는 지정된 객체의 index를 알려준다.
        System.out.println("index=" + list1.indexOf("1")); // 0
        System.out.println("index=" + list1.indexOf(1));   // 2
        list1.remove(0); // index가 0인 객체를 삭제함
//      list1.remove(new Integer(0)); -> 0을 삭제함
        print(list1, list2);
        
//      list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.(교집합)
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);
        
//      list2에서 list1에 포함된 객체들을 삭제한다.(차집합)
        for(int i=list2.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i); // index가 i인 곳에 저장된 요소를 삭제
        }
        print(list1, list2);
    }
    
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }

}
