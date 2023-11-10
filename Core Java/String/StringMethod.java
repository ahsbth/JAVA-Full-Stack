public class StringMethod {
    public static void main(String args[])
    {
        // 1.length() methode count the no of charecters in the string
        String s=new String("Galgotias");
        System.out.println(s.length());
        // 2.isEmpty() methode check the whether a string is empty or not it return result in the form of true or false.
        System.out.println(s.isEmpty());
        // 3.charAt():-it return the charecter prsent at the i th position.
        System.out.println(s.charAt(3));
        //4.substring():-it return the substring from the ith index to the end of the string
        System.out.println(s.substring(3));
        System.out.println(s.substring(2,7));
        //5.concat():concatenate specified string to the end of existing string.
        String s1=s.concat("University");
        System.out.println(s1);
        //6.indexOf():it return the index of charecter of the string with the first occurence of the specified string.
        System.out.println(s.indexOf("U"));
        System.out.println(s.indexOf("gal",3));
        //7.lastIndex():return the last index within the string of the starting to the last occurence of the string.
        System.out.println(s.lastIndexOf('a'));

        /*8.equals():in string eqaul method is used to check the equality of the two string
         it return true if the both string are equal otherwise it return false. it behave two in 
         the working of this it work on the basis of the vlaue/content in the case of String Class 
         and it work on address in the case of Super Object class.
        */
        System.out.println(s.equals(s1));
        //9.equalsIgnoreCase(): it work on the ignoring the string casee like upper case and lower case latter.
        System.out.println(s.equalsIgnoreCase(s1));
        //10.compareTo(): it is used to compare to string on the basis of loxicographically.
        System.out.println(s.compareTo(s1));
        //11.compareToIgnoreCase(): same as compareTo but Ignoring the Cases.
        System.out.println(s.compareToIgnoreCase(s1));
        //toUpperCase():it converted the string into the Upper case letter.
        System.out.println(s1.toUpperCase());
        //12.toLowerCase():it converts the string into the lower case letter.
        System.out.println(s1.toLowerCase());
        //13.trim():-it remove the spaces of the string followed by the staring spaces and the ending spaces.
        String s2="     Hi";
        System.out.println(s2);
        System.out.println(s2.trim());
        //14.replace():-it replace the old charecter of the string with the new chrecter .
        String s3="to food get food";
        System.out.println(s3);
        System.out.println(s3.replace('f','g'));
        //.15 contains(): it return true when the existing string contain the specified String otherwise return false.
        String s4="food";
        System.out.println(s3.contains(s4));
        //16.endsWith():-it return true when the string is end with specified charecter.
        System.out.println(s4.endsWith("d"));
        //17.toCharArray():-it covert a string into a charecter array
        System.out.println(s4.toCharArray());
        















    }
}
