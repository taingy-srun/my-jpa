package entities;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    private int id;
    private String model;
    private String make;
    private int year;
    private int mileage;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinTable
    private Person owner;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "driver_id")
    private Person driver;

    public Car() {
    }

    public Car(int id, String model, String make, int year, int mileage) {
        this.id = id;
        this.model = model;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

}
