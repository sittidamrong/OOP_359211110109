package ooplab9;

public class Job {
    private String position;
    private String salary;


    public Job(String position, String salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
