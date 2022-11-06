package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_9 {

    public static void main(String[] args) {
        
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "3", "4", "4"};
        Set set = new HashSet(); // 중복 X
        
        for(int i=0; i<objArr.length; i++) {
            set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장한다.
        }
//      HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);
        
//      HashSet에 저장된 요소들을 출력한다. (Iterator 이용)
        Iterator it = set.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

}

// 만약 중복을 제거하는 동시에 저장한 순서를 유지하고자 한다면 HashSet대신 LinkedHashSet을 사용해야한다.
