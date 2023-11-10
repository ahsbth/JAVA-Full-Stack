public class ConvertUptoLCase {
    public static void main(String[] args){
        String s="hi i am a student";
        char[] k=s.toCharArray();
        int i=0;
       while(i!=k.length){
            if(k[i]!=' '){
               k[i]=(char)(k[i]-32);
            }
            i++;
        }
        System.out.println(k);
    }
}
