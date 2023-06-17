package Array_String;

public class MergeStringsAlternately {

    //T.C: O(min(word1.length, word2.length) Ana Worst case T.C: O(max(word1.length, word2.length))
    //S.C: O(1)
    public static String mergeAlternately(String word1, String word2) {

        StringBuilder ans = new StringBuilder();
        int len1 = word1.length(), len2 = word2.length();
        int minLen = Math.min(len1, len2);

        int i;
        for(i=0;i<minLen;i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }

        if(minLen == len1) {
            for(int j=i;j<len2;j++)
                ans.append(word2.charAt(j));
        }
        else{
            for(int j=i;j<len1;j++)
                ans.append(word1.charAt(j));
        }

        return ans.toString();
    }

    //T.C: O(m + n)

    //Two pointer approach
    /*
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i++));
            }
            if (j < n) {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }
    */


    //One pointer approach
    /*
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
    */


    public static void main(String[] args) {
        System.out.println("Merge Strings Alternately");

        System.out.println(mergeAlternately("Hello", "Dharmendra"));
    }
}
