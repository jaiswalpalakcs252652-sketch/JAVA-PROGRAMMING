/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractcar;
abstract class Car{
    abstract void start();
    void displayDetails(String carName)
    {
        System.out.println("Car: " + carName);
    }
}

class BMW extends Car{
    @Override
    void start()
    {
        System.out.println("BMW starts with Push Button.");
    }
}


class Audi extends Car{
    @Override
    void start()
    {
        System.out.println("Audi starts with Smart Key.");
    }
}

class Tesla extends Car{
    @Override
    void start()
    {
        System.out.println("Tesla starts using Electric Power.");
    }
}

class Maruti extends Car{
    @Override
    void start()
    {
        System.out.println("Maruti starts with a Key Ignition.");
    }
}

public class AbstractCar {

     public static void main(String[] args) {
        Car car1 = new BMW();
        Car car2 = new Audi();
        Car car3 = new Tesla();
        Car car4 = new Maruti();

        car1.displayDetails("BMW");
        car1.start();

        System.out.println();
        car2.displayDetails("Audi");
        car2.start();

        System.out.println();
        car3.displayDetails("Tesla");
        car3.start();

        System.out.println();
        car4.displayDetails("Maruti");
        car4.start(); 
    }
   
}

