package ooplab7;
//talking about student
//1.student id
//2.name
//3.person id
//4.address


//access control
//1.public
//2.private
//3.protected

public class student {
   //properties of student classs
    public static int age;
    public String group;
    private String id;
    private String name;
    private String pid;
    private String address;
    //constructor
    //default constructor
    public  student () {}
    //create by own
    public  student (String id,String n,String pid,String a){
        //assign data to class properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.address = a;
    }
    //getter and setter methods

    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}//classs
