package com.packt.cardatabase.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerId;
    private String firstName, lastName;
//    @ManyToMany(cascade = CascadeType.PERSIST)
//    @JoinTable(name = "car_owner", joinColumns = {@JoinColumn(name = "ownerid")}, inverseJoinColumns = {@JoinColumn(name = "id")})
//    private Set<Car> cars;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;

    public Owner () {};

    public Owner(String firstName, String lastName) {
        super();
        this.lastName=lastName;
        this.firstName=firstName;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public Set<Car> getCars() {
//        return cars;
//    }
//
//    public void setCars(Set<Car> cars) {
//        this.cars = cars;
//    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
