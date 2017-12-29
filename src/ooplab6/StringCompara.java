package ooplab6;

public class StringCompara {
    public static void main(String[] args) {
       String  str1="Hello";
       String  str2="Hello";
       //compare string
        //type1(==)t/f
        if ( str1 == str2 )System.out.println("true");
        else System.out.println("false");

        //type2(epusals()method)
        if (str1.equals(str2))System.out.println("true");
        else System.out.println("falae");

        //type3(compareto()method)
        //0= string is equal.
        //+= left string is less rigst string
        //-= right string is more than right string

        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else  if (str1.compareTo(str2)>=1)
            System.out.println("str2 is more than str1");
        else
            System.out.println("str1 is mire than str2");






    }//main
}//class
