package resumedesignform;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class ResumeDesignForm extends JFrame implements ActionListener {

    JTextField nameField, emailField, phoneField, dobField;
    JTextArea addressArea, summaryArea;
    JRadioButton male, female, other;
    JComboBox<String> educationBox;
    JCheckBox java, python, cpp, html;
    JButton submitButton, clearButton;
    ButtonGroup genderGroup;

    public ResumeDesignForm() {

        setTitle("Student Resume Form");
        setSize(550, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(13, 2, 10, 10));
        mainPanel.setBackground(new Color(204, 255, 204));
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("My Resume (S089)", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(new Color(0, 100, 0));

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(153, 255, 153));
        titlePanel.add(title);

        add(titlePanel, BorderLayout.NORTH);

        mainPanel.add(new JLabel("Full Name :"));
        nameField = new JTextField();
        mainPanel.add(nameField);

        mainPanel.add(new JLabel("Gender :"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.setBackground(new Color(204, 255, 204));

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);
        mainPanel.add(genderPanel);

        mainPanel.add(new JLabel("Date of Birth (dd/mm/yyyy):"));
        dobField = new JTextField();
        mainPanel.add(dobField);

        mainPanel.add(new JLabel("Email :"));
        emailField = new JTextField();
        mainPanel.add(emailField);

        mainPanel.add(new JLabel("Phone Number :"));
        phoneField = new JTextField();
        mainPanel.add(phoneField);

        mainPanel.add(new JLabel("Address :"));
        addressArea = new JTextArea(3, 20);
        mainPanel.add(new JScrollPane(addressArea));

        mainPanel.add(new JLabel("Education :"));
        String[] degrees = {"Select", "High School", "Diploma", "BSC", "BCA", "B.Com", "MSC", "MCA"};
        educationBox = new JComboBox<>(degrees);
        mainPanel.add(educationBox);

        mainPanel.add(new JLabel("Skills :"));
        JPanel skillPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        skillPanel.setBackground(new Color(204, 255, 204));

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        cpp = new JCheckBox("C++");
        html = new JCheckBox("HTML/CSS");

        skillPanel.add(java);
        skillPanel.add(python);
        skillPanel.add(cpp);
        skillPanel.add(html);

        mainPanel.add(skillPanel);

        mainPanel.add(new JLabel("Resume Summary :"));
        summaryArea = new JTextArea(4, 20);
        mainPanel.add(new JScrollPane(summaryArea));

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        submitButton.setBackground(new Color(102, 204, 102));
        clearButton.setBackground(new Color(255, 153, 153));

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        mainPanel.add(submitButton);
        mainPanel.add(clearButton);

        add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {

            String gender = male.isSelected() ? "Male"
                    : female.isSelected() ? "Female"
                    : other.isSelected() ? "Other"
                    : "Not Selected";

            String skills = "";

            if (java.isSelected()) skills += "Java ";
            if (python.isSelected()) skills += "Python ";
            if (cpp.isSelected()) skills += "C++ ";
            if (html.isSelected()) skills += "HTML/CSS ";

            String message =
                    "Resume Submitted Successfully!\n\n" +
                    "Name: " + nameField.getText() + "\n" +
                    "DOB: " + dobField.getText() + "\n" +
                    "Gender: " + gender + "\n" +
                    "Email: " + emailField.getText() + "\n" +
                    "Phone: " + phoneField.getText() + "\n" +
                    "Address: " + addressArea.getText() + "\n" +
                    "Education: " + educationBox.getSelectedItem() + "\n" +
                    "Skills: " + skills + "\n" +
                    "Summary: " + summaryArea.getText();

            JOptionPane.showMessageDialog(this, message, "Resume Submitted", JOptionPane.INFORMATION_MESSAGE);

        } else {

            nameField.setText("");
            dobField.setText("");
            emailField.setText("");
            phoneField.setText("");
            addressArea.setText("");
            summaryArea.setText("");

            genderGroup.clearSelection();
            educationBox.setSelectedIndex(0);

            java.setSelected(false);
            python.setSelected(false);
            cpp.setSelected(false);
            html.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new ResumeDesignForm();
    }
}