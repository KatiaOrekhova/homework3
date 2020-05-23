package com.company;

public class HisCar implements CarInterface {
    
    @Override
    public void gas(int amount){
        System.out.println("gas:"+amount);

    } 

    @Override
    public void brake(int amount){
        System.out.println("brake:"+amount);
    } 

    @Override
    public void description(){
        System.out.println("His car");
       
    }
    


    public static void main(String[] args) {
        CarInterface object = new HisCar();

        object.gas(35);
        object.brake(60);
        object.description();
}
}