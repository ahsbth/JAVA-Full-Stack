/*
 WAP to check to string are Anagram or not if two string are equals to each other after the sorting.
 INPUT:First String: "aradhya"
       Second String: "hradaya"
 OUTPUT: true
 INPUT:First String: "apple"
      Second String: "apolo"
 OUTPUT: false
 */
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        String s="aradhya";
        String s1="hradaya";
        char[] a=s.toCharArray();
        char[] b=s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean result=Arrays.equals(a,b);
        if(result==true){
            System.out.println("String is Anagram");
        }
        else{
            System.out.println("String is not Panagram");
        }
    }
}
