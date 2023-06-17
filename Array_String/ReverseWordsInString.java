package Array_String;

public class ReverseWordsInString {

    public static String reverseWords(String s) {
        s = s.trim();

        String[] arr = s.split(" ");
        s = "";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length() == 0){
                continue;
            }
            s = s + arr[i] +" ";
        }

        s = s.trim();
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Reverse Words in a String");

        System.out.println(reverseWords("Hello From Dharmendra"));
    }
}
