package ooplab8;

public class shapeapp {
    public static void main(String[] args) {
        rectangle Rectangle =new rectangle(20,30);

        System.out.println(Rectangle.findArea());


        Circle circle = new Circle(5);
        System.out.println(circle.findArea());
    }//main
}//class
