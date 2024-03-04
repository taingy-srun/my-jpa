package entities;

import jakarta.persistence.Entity;

@Entity
public class Driver extends Person {

    public Driver() {}

    public Driver(int id, String name, int age) {
        super(id, name, age);
    }
}
