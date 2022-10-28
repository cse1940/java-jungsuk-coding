package ch09;

public class Ex9_1 {

    public static void main(String[] args) {
        
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if(v1.equals(v2)) // equals메서드는 주소값으로 비교를 하기 때문에, 비교한 결과는 false임
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    } // main

}

class Value {
    int value;
    
    Value(int value) {
        this.value = value;
    }
}
