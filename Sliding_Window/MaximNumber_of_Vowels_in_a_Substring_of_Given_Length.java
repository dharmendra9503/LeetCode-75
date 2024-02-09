package Sliding_Window;

public class MaximNumber_of_Vowels_in_a_Substring_of_Given_Length {
    private static boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    private static int maxVowels(String s, int k) {
        int i=0, j=0;
        int maxVowel = Integer.MIN_VALUE;
        int vowelCount = 0;
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};

        while(j < s.length()) {
            char c = s.charAt(j);
            if(contains(c, vowel)) {
                vowelCount++;
            }

            if(j-i+1 == k) {
                maxVowel = Math.max(maxVowel, vowelCount);
                if(contains(s.charAt(i), vowel)) {
                    vowelCount--;
                }
                i++;
            }
            j++;
        }

        return maxVowel;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Number of Vowels in a Substring of Given Length");

        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}
