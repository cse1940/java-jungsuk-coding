package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

    public static void main(String[] args) {
        
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc"); // 중복이라 저장X
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));
        
        System.out.println(set);
    }

}

//  equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작함
class Person {
    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }

    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + ":" + age;
    }
}
