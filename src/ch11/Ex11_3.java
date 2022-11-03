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
                    st.push(ch + ""); // 스택에 다시 넣고
                } else if(ch == ')') {
                    st.pop();         // 스택에서 '('를 꺼낸다.
                }
            }
            if(st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch(EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        } // try의 끝

    }

}
