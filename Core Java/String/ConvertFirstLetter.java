/*
 Write a programe to converts the first letter of string  into a Capital letter like this
 INPUT: "delhi is capital of india"
 OUTPUT: "Delhi Is Capital Of India"
 */
public class ConvertFirstLetter {
    public static void main(String args[]){
        String s="delhi is capital of india";
        char[] k=s.toCharArray();
        System.out.println(s);
        k[0]=(char)(k[0]-32);
        for(int i=1;i<k.length;i++){
            if(k[i]==' '){
            k[i+1]=(char)(k[i+1]-32);
            }
        }
        System.out.println(k);
    }
}
