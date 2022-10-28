package ch09;

class Person {
    long id;
    
    public boolean equals(Object obj) {
        if(obj instanceof Person) 
            return id == ((Person)obj).id; // obj�� ObjectŸ���̹Ƿ� id���� �����ϱ� ���ؼ��� PersonŸ������ ����ȯ�� �ʿ��ϴ�.
        else
            return false; // Ÿ���� Person�� �ƴϸ� ���� ���� �ʿ䵵 ����.
    }
    
    Person(long id) {
        this.id = id;
    }
}

public class Ex9_2 {

    public static void main(String[] args) {
        
        Person p1 = new Person(80110811112222L);
        Person p2 = new Person(80110811112222L);
        
        if(p1.equals(p2))
            System.out.println("p1�� p2�� ���� ����Դϴ�.");
        else 
            System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
    }

}
