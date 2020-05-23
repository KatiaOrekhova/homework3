package com.company; 
public class MyCar extends Car {
    
   

        MyCar(String model, int speed, String color){
    this.model = model;
    this.speed = speed;
    this.color = color;
    }

    public void description() {
System.out.println("Model is "+this.model);
System.out.println("Speed is " +String.valueOf(this.speed));
System.out.println("Speed is " +String.valueOf(this.color));
    }


    public static void main(String[] args) {
       
        Car object = new MyCar("Mustang", 150, "red");

        object.gas(35);
        object.brake(60);
        object.description();
        



         

        

    }
}