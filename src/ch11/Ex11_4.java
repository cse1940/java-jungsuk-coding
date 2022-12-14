package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.
    
    public static void main(String[] args) {
        
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        
        while(true) {
            System.out.print(">> ");
            try {
//              화면으로부터 라인단위로 입력받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();
                
                if("".equals(input)) continue; // while문으로 다시 돌아감
                
                if(input.equalsIgnoreCase("q")) {
                    System.exit(0); // 프로그램 종료
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i = 0;
//                  입력받은 명령어를 저장하고,
                    save(input);
                    
//                  LinkedList의 내용을 보여준다.
                    LinkedList temp = (LinkedList)q;
                    ListIterator it = temp.listIterator();
                    
                    while(it.hasNext()) // boolean hasNext() 읽어올 요소가 있는지 확인
                        System.out.println(++i + "." + it.next()); // Object next() 다음 요소를 읽어옴
                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q")) {
            } catch(Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }
    
    public static void save(String input) {
//      queue에 저장한다.
        if(!"".equals(input)) // 입력된 값이 공백이 아니라면
            q.offer(input); // 객체 저장

//      queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if(q.size() > MAX_SIZE) // size()는 Collection인터페이스에 정의
            q.remove();
    }
}

