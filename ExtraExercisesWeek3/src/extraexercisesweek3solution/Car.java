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
public class Car {
    
    private String manufacture;
    private String model;
    private int year;

    public Car(String manufacture, String model, int year) {
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return manufacture + " " + model + " " + year;
    }
    
    
    
}
