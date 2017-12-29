package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
        //stringTokenizer
        String  msg = "Hello welcome MT RMUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
        //countTokens()
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreTokens()){
            StringBuffer buffer =
                    new StringBuffer(myToken.nextToken());
            System.out.print(buffer.reverse()+" ");




        }//while


    }//main
}//dlas
