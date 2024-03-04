package entities;

import jakarta.persistence.*;

@Entity
public class Owner extends Person {

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Car car;

    public Owner(int id, String name, int age, Car car) {
        super(id, name, age);
        this.car = car;
    }

    public Owner() {
        super();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}