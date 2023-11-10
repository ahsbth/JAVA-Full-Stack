/*
 WAP to count the no of vowels , consonants and the no of special charecters in a string.
 INPUT: "apple is a type of fruits"
 OUTPUT: Vowel: 8
        Consonant: 12
        Special Charecter: 5
 */

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        try (// String s = "apple is a type of fruits";
        Scanner scob = new Scanner(System.in)) {
            String s=new String();
            System.out.println("Enter the String:");
            s=scob.nextLine();
            s=s.toLowerCase();
            // System.out.println(s);
            char[] k = s.toCharArray();
            int vc = 0, cc = 0, sc = 0;
            for (int i = 0; i < k.length; i++) {
                if ((k[i] >= 65 && k[i] <= 97) || (k[i] >= 97 && k[i] <= 122)) {
                    if (k[i] == 'a' || k[i] == 'e' || k[i] == 'i' || k[i] == 'o' || k[i] == 'u') {
                        vc++;
                    }
                    else{
                        cc++; 
                    }
                } 
                else {
                    sc++;
                }
            }
             System.out.println("Vowel:" + vc);
             System.out.println("Consonant:" + cc);
             System.out.println("Special Charecter:" + sc);
        }
       
    }
}
