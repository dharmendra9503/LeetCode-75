package Stack;

public class Removing_Stars_From_a_String {
    //Solution - 1
    //T.C: O(N)
    //S.C: O(N)
    /*
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '*') {
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        String ans = "";
        while(!stack.isEmpty()) {
            ans = stack.pop()+ans;
        }
        return ans;
    }
    */


    //Solution - 2
    //T.C: O(N)
    //S.C: O(1)
    public static String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray())
            if (c == '*')
                res.setLength(res.length() - 1);
            else
                res.append(c);
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println("Removing Stars From a String");

        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
