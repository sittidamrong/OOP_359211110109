package ooplab8;

public class employee extends person{
 private String position;
 private Integer salary;
 private String company;


 public employee(String personID, String name, String address, String gender,
                 String position, Integer salary, String company) {
  super(personID, name, address, gender);

  this.position = position;
  this.salary = salary;
  this.company = company;
 }

 public String getPosition() {
  return position;
 }

 public void setPosition(String position) {
  this.position = position;
 }

 public Integer getSalary() {
  return salary;
 }

 public void setSalary(Integer salary) {
  this.salary = salary;
 }

 public String getCompany() {
  return company;
 }

 public void setCompany(String company) {
  this.company = company;
 }
}//class



