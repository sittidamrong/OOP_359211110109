package ooplab9;

public class myPerson {
    public static void main(String[] args) {

        Person person = new Person("nakarin", 22,
        new Address ("188","nakhonsrithammarat","80000"),
                new Job("receptionist","25000"));
        System.out.println(person.toString());

    }
}//class
