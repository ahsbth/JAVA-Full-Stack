/*
 WAP to count no of the words in a string.
 INPUT: "apple is a type of fruits"
 OUTPUT: 6
 INPUT: "Idia is a Great Country"
 OUTPUT: 5
 */
public class NofWords {
    public static void main(String[] args) {
        String s = " Delhi is a Capital  of India ";
        s.trim();
        NofWords n = new NofWords();
        System.out.println(n.nofWordCount(s) + 1);
    }

    int nofWordCount(String a) {
        int wc = 0;
        String a1=a.trim();
        //char[] k = a.toCharArray();
        for (int i = 0; i <= a1.length() - 1; i++) {
            if (a1.charAt(i)==' '||a1.charAt(i)=='\n'||a1.charAt(i)=='\t') {
                wc++;
            }
        }
        return wc;
    } 
}
