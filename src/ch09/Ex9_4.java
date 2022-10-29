package ch09;

class Card {
    String kind;
    int number;
    
    Card() {
        this("SPADE", 1);
    }
    
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

public class Ex9_4 {

    public static void main(String[] args) {
        
        Card c1 = new Card();
        Card c2 = new Card();
        
//      서로 다른 인스턴스에 대해서 toString()을 호출하였으므로 클래스의 이름은 같아도 해시코드값이 다르다는 것을 확인할 수 있다.
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

}
