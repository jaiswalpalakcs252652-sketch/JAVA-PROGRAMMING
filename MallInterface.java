/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mallinterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface MallOperations {
    void generateBill(String itemName, int quantity, double price);
}

class MallBill implements MallOperations {

    @Override
    public void generateBill(String itemName, int quantity, double price) {

        double total = quantity * price;

        JOptionPane.showMessageDialog(null,
                "******** MALL BILL ********\n"
                + "Item Name : " + itemName
                + "\nQuantity : " + quantity
                + "\nPrice per Item : ₹" + price
                + "\n--------------------------"
                + "\nTotal Bill : ₹" + total);
    }
}

public class MallInterface extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    
    MallOperations bill = new MallBill();

    MallInterface() {

        setTitle("Mall Billing System");
        setSize(350, 250);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Item Name");
        l2 = new JLabel("Quantity");
        l3 = new JLabel("Price");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("Generate Bill");
        b1.addActionListener(this);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(new JLabel());
        add(b1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String item = t1.getText();
        int qty = Integer.parseInt(t2.getText());
        double price = Double.parseDouble(t3.getText());

        bill.generateBill(item, qty, price);
    }

    public static void main(String[] args) {
        new MallInterface();
    }
}

  
    

