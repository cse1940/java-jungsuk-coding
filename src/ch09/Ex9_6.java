package ch09;

public class Ex9_6 {

    public static void main(String[] args) {
        
        String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1에 저장됨
        String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2에 저장됨
        System.out.println("String str1 = \"abc\";");
        System.out.println("String str2 = \"abc\";");
        
        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
        System.out.println();
        
        String str3 = new String("abc"); // 새로운 String인스턴스를 생성
        String str4 = new String("abc"); // 새로운 String인스턴스를 생성
            
        System.out.println("String str3 = \"abc\";");
        System.out.println("String str4 = \"abc\";");
        
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str3.equals(str4) ? " + str3.equals(str4));

    }

}

//  equals()를 사용했을 때는 두 문자열의 내용("abc")을 비교하기 때문에 두 경우 모두 true를 결과로 얻지만,
//  String인스턴스의 주소를 등가비교연산자'=='로 비교했을 때는 결과가 다르다.
