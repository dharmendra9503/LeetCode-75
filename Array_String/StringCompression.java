package Array_String;

public class StringCompression {

    public static int compress(char[] chars) {

        int i=0, res = 0;
        while(i < chars.length) {
            int subLength = 1;
            while(i + subLength < chars.length && chars[i + subLength] == chars[i]) {
                subLength++;
            }

            chars[res++] = chars[i];

            if(subLength > 1) {
                for(char c : Integer.toString(subLength).toCharArray()) {
                    chars[res++] = c;
                }
            }

            i += subLength;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println("String Compression");

        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
