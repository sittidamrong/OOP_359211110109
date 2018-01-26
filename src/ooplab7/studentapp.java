package ooplab7;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

import java.util.Scanner;

public class studentapp {
    public static void main(String[] args) {
        //create object as stutent
        student s1 = new student();
        s1.setId("0001");
        s1.setName("boy saiyai");
        s1.setPid("1111111111111");
        s1.setAddress("11/11 t.thamyai a.thungsong");
        System.out.println(s1.toString());


        student s2 = new student("0002",
                "girl saiyai",
                "2222222222222",
                "22/22 t.thawang a.muang ");
        System.out.println(s2.toString());


        student s3 = new student();
        s3 = inputdata (s3);


    }//main

    private static student inputdata(student s) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("insert your student info:");
        System.out.println("student id");
        s.setId(scanner.nextLine());
        System.out.println("name:");
        s.setName(scanner.nextLine());
        System.out.println("person id:");
        s.setPid(scanner.nextLine());
        System.out.println("address:");
        s.setAddress(scanner.nextLine());
        return s;


    }//inputdata
}//class
