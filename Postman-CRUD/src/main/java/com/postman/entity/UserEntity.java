package com.postman.entity;

import javax.persistence.*;

@Entity
@Table(name = "Userdetails")
public class UserEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firstname",nullable = false,length = 20)
    private String firstName;

    @Column(name = "lastname",nullable = false,length = 20)
    private String lastName;

    @Column(name = "city",nullable = false,length = 30)
    private String city;

    @Column(name = "state",nullable = false,length = 20)
    private String state;

    //Default Constructor;;;
    public UserEntity() {
    }

    //Parameterised Constructor;;;
    public UserEntity(long id, String firstName, String lastName, String city, String state) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
    }

    //Getter And Setter;;;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}