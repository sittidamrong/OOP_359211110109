package ooplab9;

public class Engine {
    private String size;
    private String typs;

    public Engine(String size, String typs) {
        this.size = size;
        this.typs = typs;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size='" + size + '\'' +
                ", typs='" + typs + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTyps() {
        return typs;
    }

    public void setTyps(String typs) {
        this.typs = typs;
    }
}//class
