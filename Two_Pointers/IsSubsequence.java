package Two_Pointers;

public class IsSubsequence {

    //T.C: O(lenS * lenT)
    /*
    public static boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        int cnt = 0;

        int j = 0;
        for(int i=0;i<lenS;i++){
            char ch = s.charAt(i);

            while(j < lenT) {
                if(ch == t.charAt(j)){
                    cnt++;
                    j++;
                    break;
                }
                j++;
            }
        }

        return cnt == lenS;
    }
    */


    //T.C: O(t.length())
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        for(int j=0;j<t.length() && i<s.length();j++){
            if(t.charAt(j) == s.charAt(i))
                i++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        System.out.println("Is Subsequence");

        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
