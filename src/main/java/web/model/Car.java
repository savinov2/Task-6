package web.model;

public class Car {
    private String model;
    private String seriasNumber;
    private String brand;

    public Car(String model, String seriasNumber, String brand) {
        this.model = model;
        this.seriasNumber = seriasNumber;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeriasNumber() {
        return seriasNumber;
    }

    public void setSeriasNumber(String seriasNumber) {
        this.seriasNumber = seriasNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
