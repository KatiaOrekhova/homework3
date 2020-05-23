package com.company; 

public abstract class Car {

    String model;
    String color;
    int speed;

    public void gas(int amount) {
        System.out.println("gas:"+amount);

    }
    public void brake(int amount) {
        System.out.println("brake:"+amount);

    }
    
    public abstract void description();

}
