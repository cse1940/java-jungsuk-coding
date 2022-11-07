package ch12;

import java.util.ArrayList;

public class GenericTest {

    public static void main(String[] args) {
       
//      ArrayList list = new ArrayList(); -> 일반 클래스
        ArrayList<Object> list = new ArrayList<Object>(); // 지네릭 클래스
        list.add(10); // list.add(new Integer(10));
        list.add(20);
        list.add("30"); // 지네릭스 덕분에 타입 체크가 강화됨
        
//      Integer i = (Integer)list.get(2); -> compile Ok!
        String i = (String)list.get(2); // 형변환 생략 가능
        
        System.out.println(list);
    }

}
