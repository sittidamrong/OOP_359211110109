package ooplab3;

import java.util.Scanner;

public class TestSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your namber");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Your entered 1.");
                break;
            case 2:
                System.out.println("Your entered 2.");
                break;
            case 3:
                System.out.println("Your entered 3.");
                break;
            default:
                System.out.println("Please enter number1-3");
        }//svitch
  }//main
}//class
