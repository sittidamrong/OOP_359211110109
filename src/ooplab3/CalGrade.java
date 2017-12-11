package ooplab3;

import java.util.Scanner;

//0-49=F
//50-56=D
//60-69=C
//70-79=B
//80-100=A
public class CalGrade {
    public static void main(String[] args) {
//        Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score");
        int Score = scanner.nextInt();

//      test condition

        if(Score <= 49) System.out.println("your grade is F" );
        else if(Score <= 70)System.out.println("your grade is D");
        else if(Score <= 60)System.out.println("your grade is c");
        else if(Score <= 50)System.out.println("your grade is B");
        else
            System.out.println("your grade is A");

    }//main
}//class

