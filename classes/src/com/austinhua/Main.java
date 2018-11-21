package com.austinhua;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car honda = new Car();

        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());

        honda.setModel("Integra DC2");
        System.out.println("Model is " + honda.getModel());

        porche.setModel("911");
        System.out.println("Model is " + porche.getModel());


    }
}
