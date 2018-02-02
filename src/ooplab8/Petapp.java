package ooplab8;

public class Petapp {
    public static void main(String[] args) {
        dog dog = new dog("kaya", 2);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.makenoise();


        cat cat = new cat("somsai", 3);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.makenoise();
    }
}//class