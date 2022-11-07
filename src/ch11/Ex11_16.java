package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

    public static void main(String[] args) {
        
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234"); // 이미 존재하는 키를 추가가능함, 기존 값은 없어짐
        
        Scanner s = new Scanner(System.in); // 화면으로부터 라인단위로 입력받는다.
        
        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = s.nextLine().trim();
            
            System.out.print("password : ");
            String password = s.nextLine().trim();
            System.out.println();
            
            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue; // while문으로 되돌아감
            }
            
            if(!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }

}

//  Map은 값은 중복을 허용하지만 키는 중복을 허용하지 않기 때문에 저장하려는
//  두 데이터 중에서 어느 쪽을 키로 할 것인지를 잘 결졍해야 한다.
