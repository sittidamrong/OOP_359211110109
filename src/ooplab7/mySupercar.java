package ooplab7;

import java.util.ArrayList;
import java.util.Scanner;

public class mySupercar {
    public static void main(String[] args) {
        ArrayList<Supercar>myCarList = new ArrayList<>();
        Supercar s1 = new Supercar();
        s1.getCarbrand();
        s1.getCarcolor();
        s1.getCarenginesize();
        s1.getMaxspeed();
        s1.getCountryoforgin();

        Supercar su = new Supercar();
        su = inputData (su);

    }//main

    private static Supercar inputData(Supercar su) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your Supercar info: ");
        System.out.print("Brand: ");
        su.setCarbrand(scanner.nextLine());
        System.out.print("Color: ");
        su.setCarcolor(scanner.nextLine());
        System.out.print("Engine Size: ");
        su.setCountryoforgin(scanner.nextLine());
        System.out.print("Max Speed: ");
        su.setMaxspeed(scanner.nextLine());
        System.out.print("Country of origin: ");
        su.setCountryoforgin(scanner.nextLine());
        System.out.println(su.toString());
        return su;
    }//inputData
}//class