/*
 WAP to check a string is pangram or not hence a string is said to be a pangram when that string
 contains the all 26 english alphabate's means a,b,c,d,e...............x,y,z;

 INPUT: "The Quick Brown Fox Jump Over A Lazy Dog"
 OUTPUT:true
  
 INPUT: "Rajasthan is known as the Landmark of the Kingdom"
 OUTPUT:false

 */
public class Pangram {
    public static void main(String[] args) {
        String s = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
        s = s.replace(" ", "");
        char[] k = s.toCharArray();
        int a[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int i = 0;
        for(i=0; i<= k.length;++i) {
            int index = k[i] - 65;
            a[index] = 1;
        }
        i = 0;
        while (i != 26) {
            
            if (a[i] == 1) {
                ++i;
            } else {
                System.out.println("Non-Pangram");
                System.exit(0);
            }
        }
        System.out.println("Pangram");

    }
}
