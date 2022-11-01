package ch09;

import java.util.ArrayList;

public class RountTest3 {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); // list에는 객체만 추가 가능함
        list.add(100); 
        
        Integer i = list.get(0); // list에 저장된 첫 번째 객체를 꺼냄(컴파일러가 자동 변환함)
//      int i = list.get(0).intValue(); -> 원래는 intValue()로 Integer를 int로 변환해야 함
    }

}
