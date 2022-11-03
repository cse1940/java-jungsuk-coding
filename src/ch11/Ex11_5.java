package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {

    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        Iterator it = list.iterator(); // Iterator 객체를 반환
        
        while(it.hasNext()) { // boolean hasNext() 읽어올 요소가 있는지 확인
            Object obj = it.next(); // Object next() 다음 요소를 읽어옴
            System.out.println(obj);
        }
    }

}
