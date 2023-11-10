/*
 WAP to reverse the string.
 INPUT: "Apple"
 OUTPUT: "elppA"
 INPUT: "Egle"
 OUTPUT:"elgE"
 */
public class Reverse{
  public static void main(String[] args)
  {
    String s="Apple";
    int l=s.length();
    char[] k=s.toCharArray();
    for(int i=l-1;i>=0;i--)
    {
      System.out.print(k[i]);
    }
  }
}