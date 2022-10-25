package ch07;

class Product3 {
    int price, bonusPoint; // 제품의 가격, 제품구매 시 제공하는 보너스점수
    
    Product3() {} // Product3클래스에 기본 생성자 Product3()가 없기 때문에 에러가 발생한다.
    
    Product3(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }
}

class Tv3 extends Product3 {
    Tv3() {}
    
    public String toString() {
        return "TV";
    }
}

class Exercise7_3 {

    public static void main(String[] args) {
       
        Tv3 t = new Tv3();

    }

}