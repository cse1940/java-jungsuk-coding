package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {

    public static void main(String[] args) {
       
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue�������̽��� ����ü�� LinkedList�� ���
        
        st.push("0"); // ��ü ����
        st.push("1");
        st.push("2");
        
        q.offer("0"); // ��ü ����
        q.offer("1");
        q.offer("2");
        
        System.out.println("= Stack =");
        while(!st.empty()) {              // ������� ������
            System.out.println(st.pop()); // ���ÿ��� ��� �ϳ��� ������ ���
        }
        System.out.println("= Queue =");
        while(!q.isEmpty()) {             // ������� ������
            System.out.println(q.poll()); // ť���� ��� �ϳ��� ������ ���
        }
    }

}