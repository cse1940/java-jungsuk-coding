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
        
//      ���� �ٸ� �ν��Ͻ��� ���ؼ� toString()�� ȣ���Ͽ����Ƿ� Ŭ������ �̸��� ���Ƶ� �ؽ��ڵ尪�� �ٸ��ٴ� ���� Ȯ���� �� �ִ�.
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }

}
