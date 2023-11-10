import java.util.Arrays;
/*
 WAP to check to string are Anagram or not if two string are equals to each other after the sorting.
 INPUT:First String: "He is aRaDhAya"
       Second String: "Is he AHRAdaya"
 OUTPUT: true
 INPUT:First String: "apple is fruits"
      Second String: "apolo is company"
 OUTPUT: false
 */
public class Anagram1 {
    public static void main(String[] args) {
        String s = "He is aRaDhAya";
        String s1 = "Is he AHRAdaya";
        s = s.replace(" ", "");
        s1 = s1.replace(" ", "");
        s = s.toLowerCase();
        s1 = s1.toLowerCase();
        char[] a = s.toCharArray();
        char[] b = s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result = Arrays.equals(a, b);
        if (result == true) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("String is not Anagram");
        }

    }
}
