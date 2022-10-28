package ch09;

public class Ex9_3 {

    public static void main(String[] args) {
        
        String str1 = new String("abc");
        String str2 = new String("abc");
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

    }

}

//  String클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode메서드가 오버라이딩되어 있기 때문에,
//  문자열의 내용이 같은 str1과 str2에 대해 hashCode()를 호출하면 항상 동일한 해시코드값을 얻는다.