package Array_String;//For more information visit: https://leetcode.com/problems/greatest-common-divisor-of-strings/editorial/

public class GreatestCommonDivisorOfStrings {

    //Brute Force Approach
    //T.C: min(len1, len2)*(len1 + len2)
    //S.C: min(len1, len2)  --> We need to keep a copy of base in each iteration,
                             // which takes O(min(len1, len2)) space.
    /*
    private static boolean isValid(String str1, String str2, int k) {
        int len1 = str1.length(), len2 = str2.length();
        if(len1%k != 0 || len2%k != 0) {
            return false;
        }
        String base = str1.substring(0, k);
        // str1.replace(base, "") returns a new string with all occurrences of base removed from str1.
        return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
    }

    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();

        for(int i=Math.min(len1, len2); i>0; i--){
            if(isValid(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }
    */


    //Optimized
    //T.C: O(len1 + len2)
    //S.C: O(len1 + len2)
    private static int gcd(int len1, int len2) {
        if(len2 == 0) {
            return len1;
        }
        else{
            return gcd(len2, len1%len2);
        }
    }

    public static String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor of Strings");

        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }
}
