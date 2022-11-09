package ch13;

import javax.swing.JOptionPane;

public class Ex13_5 {

    public static void main(String[] args) throws Exception {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();
        
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

    }

}

class ThreadEx5_1 extends Thread {
    public void run() {
        for(int i=10; i>0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch(Exception e) {}
        }
    }
}

//  이전 예제와는 달리 사용자로부터 입력받는 부분과 화면에 숫자를 출력하는 부분을 두 개의 쓰레드로 나누어서
//  처리했기 때문에 사용자가 입력을 마차지 않았어도 화면에 숫자가 출력되는 것을 알 수 있다.
