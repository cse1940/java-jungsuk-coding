package ch08;

public class Exercise8_6 {
    static void method(boolean b) {
        try {
            System.out.println(1);
            if (b) System.exit(0);
            System.out.println(2);
        } catch(RuntimeException r) {
            System.out.println(3);
            return;
        } catch(Exception e) {
            System.out.println(4);
            return;
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args) {
        
//      변수 b의 값이 true이므로 System.exit(0);이 수행되어 프로그램이 즉시 종료된다.
//      이럴 때는 finally블럭이 수행되지 않는다.
        method(true);
        method(false);

    }

}
