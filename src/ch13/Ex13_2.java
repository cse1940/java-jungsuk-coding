package ch13;

public class Ex13_2 {

    public static void main(String[] args) {
        
//      싱글쓰레드
        long startTime = System.currentTimeMillis();
        
        for(int i=0; i<300; i++)
            System.out.printf("%s", new String("-")); // "-"대신, new String("-") 사용
        
        System.out.print("소요시간1 : " + (System.currentTimeMillis() - startTime));
        
        for(int i=0; i<300; i++)
            System.out.printf("%s", new String("|")); // "|"대신, new String("|") 사용
        
        System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
    }

}
