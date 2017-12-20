package ooplab4;

import java.lang.reflect.Method;

public class TestMethod {
    //glocal variable
    private static int number=10;
   // Methods
    //type 1

    public static void A(){
        System.out.println("Hollo A");
    }//A
    //type 2
    public static void B(int x,int y){
       System.out.println("Hollo B"+(x+y));

    }//B
//type 3
    private static int c (int x, int y){
      System.out.println("Hollo c");
      return x+y;
    }//c

    public static void main(String[] args) {
       System.out.println("Hollo Main");
       A();
       B(5,10);
       //manage return value
        int num=c(5,10);
        System.out.println(num);
        System.out.println(c(5,10));
    }//main
}//class
