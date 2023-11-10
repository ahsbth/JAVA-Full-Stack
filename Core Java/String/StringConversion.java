/*
WAP to Convert the String into a lower case letter and vice versa 
without using the predefined methode.
 */
public class StringConversion {
    public static void main(String[] args){
        String s1="hello guys";
        System.out.println(s1);
        StringConversion sc=new StringConversion();
         sc.toLower(s1);
        String s2="HI BUDDY";
        System.out.println(s2);
        StringConversion sc1=new StringConversion();
        sc1.toUpper(s2);

    }
    void toLower(String a){
        char[] k=a.toCharArray();
        // String dumy="";
        for(int i=0;i<k.length;i++){
             if(k[i]==' '){
                continue;
             }
             k[i]=(char)(k[i]-32);
        }
        // return dumy;
        System.out.println(k);
    }
    void toUpper(String a){
        char[] k=a.toCharArray();
        
        for(int i=0;i<k.length;i++){
            if(k[i]==' '){
                continue;
            }
            k[i]=(char)(k[i]+32);
        }
       System.out.println(k);
    }
}
