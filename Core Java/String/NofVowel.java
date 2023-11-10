/*
 WAP to Count the nof vowels presents in a string.
 INPUT: "apple"
 OUTPUT: 2
 INPUT: "elephent"
 OUTPUT: 3
 */
public class NofVowel {
    public static void main(String[] args) {
        NofVowel n = new NofVowel();
        System.out.println(n.vowelCount("apple"));
    }

    int vowelCount(String a) {
        a.toLowerCase();
        int vc=0;
        char[] k = a.toCharArray();
        for (int i=0;i<=a.length()-1;i++) {
            if (k[i] == 'a' || k[i] == 'e' || k[i] == 'i' || k[i] == 'o' || k[i] == 'u') {
                vc++;
            }
        }
        return(vc);
    }
}
