package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

    public static void main(String[] args) {
        
        Set set = new HashSet();
        
        for(int i=0; set.size()<6; i++) {
            int num = (int)(Math.random()*45)+1;
            set.add((num));
        }
        
        List list = new LinkedList(set); // 1. set의 모든 요소를 list에 저장
        Collections.sort(list);          // 2. list를 정렬
        System.out.println(list);        // 3. list를 출력
    }

}
