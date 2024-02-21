package Stack;

import java.util.Stack;

public class Decode_String {
    private static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch != ']'){
                stack.push(ch);
            }else{
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '['){
                    sb.append(stack.pop());
                }
                stack.pop();
                int k = 0;
                int base = 1;
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    k = (stack.pop() - '0') * base + k;
                    base *= 10;
                }
                while(k-- > 0){
                    for(int i=sb.length()-1; i>=0; i--){
                        stack.push(sb.charAt(i));
                    }
                }
            }
        }

        char[] result = new char[stack.size()];
        for(int i=stack.size()-1;i>=0;i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println("Decode String");

        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
}
