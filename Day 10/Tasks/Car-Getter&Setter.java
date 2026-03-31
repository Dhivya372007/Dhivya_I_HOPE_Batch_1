class Car {
    // Private variables (Encapsulation)
    private String brand;
    private String model;
    private int year;
    private double price;

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 2000) {  // simple validation
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        // Setting values
        c.setBrand("Toyota");
        c.setModel("Innova");
        c.setYear(2022);
        c.setPrice(2000000);

        // Getting values
        System.out.println("Car Details:");
        System.out.println("Brand: " + c.getBrand());
        System.out.println("Model: " + c.getModel());
        System.out.println("Year: " + c.getYear());
        System.out.println("Price: " + c.getPrice());
    }
}

OUTPUT : 
Car Details:
Brand: Toyota
Model: Innova
Year: 2022
Price: 2000000.0
