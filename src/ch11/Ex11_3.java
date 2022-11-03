package ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {

    public static void main(String[] args) {
       
        Stack st = new Stack();
        String expression = "(2+3)+1";
        
        System.out.println("expression : " + expression);
        
        try {
            for(int i=0; i<expression.length(); i++) {
                char ch = expression.charAt(i);
                
                if(ch == '(') {
                    st.push(ch + ""); // ���ÿ� �ٽ� �ְ�
                } else if(ch == ')') {
                    st.pop();         // ���ÿ��� '('�� ������.
                }
            }
            if(st.isEmpty()) {
                System.out.println("��ȣ�� ��ġ�մϴ�.");
            } else {
                System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
            }
        } catch(EmptyStackException e) {
            System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�.");
        } // try�� ��

    }

}
