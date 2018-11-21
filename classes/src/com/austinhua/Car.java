package com.austinhua;

public class Car {

    // these are fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // setters;
    // String model is a parameter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        // needs to be lowercase because of function above
        if (validModel.equals("carrera") || validModel.equals("integra dc2")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }
    }

    // getters
    public String getModel(){
        return this.model;
    }

}
