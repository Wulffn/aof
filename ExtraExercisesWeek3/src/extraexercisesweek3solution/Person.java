/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraexercisesweek3solution;

/**
 *
 * @author mwn
 */
public class Person {
    
    private String name;
    private int age;
    private Car car;
    private Dog dog;
    private Address address;
    private Person spouse;

    public Person(String name, int age, Car car, Dog dog, Address address, Person spouse) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.dog = dog;
        this.address = address;
        this.spouse = spouse;
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
    
    
}
