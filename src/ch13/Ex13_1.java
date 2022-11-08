package ch13;

public class Ex13_1 {

    public static void main(String[] args) {
            ThreadEx1_1 t1 = new ThreadEx1_1(); // Thread의 자손 클래스의 인스턴스를 생성
            
            Runnable r = new ThreadEx1_2(); // Runnable을 구현한 클래스의 인스턴스를 생성
            Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
            
            t1.start(); // 쓰레드 t1을 실행시킨다.
            t2.start(); // 쓰레드 t2를 실행시킨다.
    }

}

class ThreadEx1_1 extends Thread { // Thread클래스를 상속해서 쓰레드를 구현
    public void run() { // 쓰레드가 수행할 작업을 작성
        for(int i=0; i<5; i++)
            System.out.println(getName()); // 조상인 Thread의 getName()을 호출
    }
}

class ThreadEx1_2 implements Runnable { // Runnable 클래스를 구현해서 쓰레드를 구현
    public void run() { // 쓰레드가 수행할 작업를 작성
        for(int i=0; i<5; i++)
            System.out.println(Thread.currentThread().getName()); // 현재 실행중인 Thread를 반환한다.
    }
}
