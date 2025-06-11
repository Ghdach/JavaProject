import java.sql.SQLOutput;

public class Car {
    private int id;
    private String name;
    private Double price;
    private float maxSpeed;
    private String description;
    private boolean available;

    static void DisplayMes(){
        System.out.println("This is my first project");
    }

    public static void main(String[] args){
        Car audi = new Car();
        Car.DisplayMes();

    }
}
