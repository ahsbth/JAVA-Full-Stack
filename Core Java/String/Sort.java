/*
 WAP to sort the string alphabatically
INPUT: "apple"
 OUTPUT:"Aelpp"
 INPUT: "acegfbd"
 OUTPUT:"abcdefg"
 */
public class Sort {
    public static void main(String[] args) {
        String s = "Apple";
        char temp;
        char[] k = s.toCharArray();
        for (int i = 0; i < k.length; i++) {
            for (int j = i + 1; j <k.length; j++) {
                if (k[j] > k[i]) {
                    temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }

        }
        System.out.println(s);
    }
}
