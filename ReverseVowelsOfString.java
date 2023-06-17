public class ReverseVowelsOfString {

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static String reverseVowels(String s) {

        char[] ch = s.toCharArray();

        int i=0, j=s.length()-1;
        while(i < j){
            boolean iV = isVowel(ch[i]);
            boolean jV = isVowel(ch[j]);

            if(iV && jV) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }

            if(!iV) {
                i++;
            }
            if(!jV) {
                j--;
            }
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println("Reverse Vowels of a String");

        System.out.println(reverseVowels("Hello"));
    }
}
