/*
 WAP to check a string is palindrome or not.
 INPUT: "apple"
 OUTPUT: False
 INPUT: "oppo"
 OUTPUT: true
 */
public class Palindrome {
    public static void main(String[] args)
    {
       Palindrome p=new Palindrome();
       String s1="oppo";
      String s2= p.checkPalindrome(s1);
      if(s1.equals(s2)){
        System.out.println("Palindrome");
      }
      else{
        System.out.println("not Palindrome");
      }

    }
    String checkPalindrome(String a)
    {
        char[] k=a.toCharArray();
        String dumy="";
        for(int i=a.length()-1;i>=0;i--){
            dumy+=k[i];
        }
        return dumy;
    }
}
