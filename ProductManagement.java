package productmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ProductManagement extends JFrame implements ActionListener {

    JLabel lblId, lblName, lblCategory, lblPrice, lblQuantity;
    JTextField txtId, txtName, txtCategory, txtPrice, txtQuantity;
    JButton btnSubmit;

    // MySQL Connection Details
    String url = "jdbc:mysql://localhost:3307/productdb";
    String user = "root";
    String password = "root";

    ProductManagement() {

        setTitle("Product Management");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        // Product ID
        lblId = new JLabel("Product ID:");
        txtId = new JTextField();

        // Name
        lblName = new JLabel("Name:");
        txtName = new JTextField();

        // Category
        lblCategory = new JLabel("Category:");
        txtCategory = new JTextField();

        // Price
        lblPrice = new JLabel("Price:");
        txtPrice = new JTextField();

        // Quantity
        lblQuantity = new JLabel("Quantity:");
        txtQuantity = new JTextField();

        // Add components
        add(lblId);
        add(txtId);

        add(lblName);
        add(txtName);

        add(lblCategory);
        add(txtCategory);

        add(lblPrice);
        add(txtPrice);

        add(lblQuantity);
        add(txtQuantity);

        // Submit button
        btnSubmit = new JButton("Submit");
        add(new JLabel(""));
        add(btnSubmit);

        btnSubmit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSubmit) {

            try {

                // Get values from text fields
                String idText = txtId.getText().trim();
                String name = txtName.getText().trim();
                String category = txtCategory.getText().trim();
                String priceText = txtPrice.getText().trim();
                String quantityText = txtQuantity.getText().trim();

                // Check empty fields
                if (idText.isEmpty() ||
                    name.isEmpty() ||
                    category.isEmpty() ||
                    priceText.isEmpty() ||
                    quantityText.isEmpty()) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Please fill all fields."
                    );

                    return;
                }

                // Convert numeric values
                int id = Integer.parseInt(idText);
                double price = Double.parseDouble(priceText);
                int quantity = Integer.parseInt(quantityText);

                // Establish database connection
                Connection con = DriverManager.getConnection(
                        url,
                        user,
                        password
                );

                // SQL query
                String sql = "INSERT INTO products "
                           + "(product_id, name, category, price, quantity) "
                           + "VALUES (?, ?, ?, ?, ?)";

                PreparedStatement pst = con.prepareStatement(sql);

                // Set values
                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, category);
                pst.setDouble(4, price);
                pst.setInt(5, quantity);

                // Execute query
                int result = pst.executeUpdate();

                if (result > 0) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Product added successfully!"
                    );

                    // Clear fields
                    txtId.setText("");
                    txtName.setText("");
                    txtCategory.setText("");
                    txtPrice.setText("");
                    txtQuantity.setText("");
                }

                // Close resources
                pst.close();
                con.close();

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Product ID and Quantity must be integers, and Price must be a number."
                );

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Database Error: " + ex.getMessage()
                );
            }
        }
    }

    public static void main(String[] args) {
        new ProductManagement();
    }
}