package HashMap_Set;

import java.util.Arrays;

public class Determine_if_Two_Strings_Are_Close {
    private static boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c : word1.toCharArray()) {
            freq1[c-'a']++;
        }

        for(char c : word2.toCharArray()) {
            freq2[c-'a']++;
        }

        for(int i=0;i<26;i++) {
            if((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for(int i=0;i<26;i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Determine if Two Strings Are Close");

        String word1 = "abc", word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }
}
