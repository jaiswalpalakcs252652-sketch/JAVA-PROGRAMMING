/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

public class Bank {

    void display() {
        System.out.println("Welcome to the Bank");
    }

    public static void main(String[] args) {
        Bank b = new SBI();
        b.display();
    }
}

class SBI extends Bank {

    @Override
    void display() {
        System.out.println("Welcome to SBI Bank");
    }
}
