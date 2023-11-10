// Program to count how many times charecter s is presence in a string
public class WordCount {
    public static void main(String[] args)
    {
        WordCount wc=new WordCount();
        System.out.println(wc.presenceOfWord("swettest"));
    }
    int presenceOfWord(String a){
        a.toLowerCase();
        int c=0;
        for(int i=0;i<a.length()-1;i++)
        {
          if(a.charAt(i)=='s'){
            c++;
          }
        }
        return c;
    }
}
