import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * AddCustomerPanel - Implements the "Add Customer" use case.
 * Allows the user to add a new customer to the system.
 */
public class AddCustomerPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField emailField;
    private JTextField phoneField;
    
    public AddCustomerPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Add Customer");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);
        
        // Create form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // First Name field
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("First Name:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        firstNameField = new JTextField(20);
        formPanel.add(firstNameField, gbc);
        
        // Last Name field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Last Name:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        lastNameField = new JTextField(20);
        formPanel.add(lastNameField, gbc);
        
        // Email field
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Email:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        emailField = new JTextField(20);
        formPanel.add(emailField, gbc);
        
        // Phone field
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Phone:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        phoneField = new JTextField(20);
        formPanel.add(phoneField, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton addCustomerButton = new JButton("Add Customer");
        JButton backButton = new JButton("Back to Menu");
        
        addCustomerButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Prototype only: Customer added");
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(addCustomerButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 