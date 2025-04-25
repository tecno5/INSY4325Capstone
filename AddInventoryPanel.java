import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * AddInventoryPanel - Implements the "Add New Inventory" use case.
 * Allows the user to add a new book to the inventory.
 */
public class AddInventoryPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField isbnField;
    private JTextField titleField;
    private JTextField authorField;
    private JTextField publisherField;
    private JTextField priceField;
    private JTextField quantityField;
    
    public AddInventoryPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Add New Inventory");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);
        
        // Create form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // ISBN field
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("ISBN:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        isbnField = new JTextField(20);
        formPanel.add(isbnField, gbc);
        
        // Title field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Title:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        titleField = new JTextField(20);
        formPanel.add(titleField, gbc);
        
        // Author field
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Author:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        authorField = new JTextField(20);
        formPanel.add(authorField, gbc);
        
        // Publisher field
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(new JLabel("Publisher:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 3;
        publisherField = new JTextField(20);
        formPanel.add(publisherField, gbc);
        
        // Price field
        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(new JLabel("Price:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 4;
        priceField = new JTextField(20);
        formPanel.add(priceField, gbc);
        
        // Quantity field
        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(new JLabel("Quantity:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        quantityField = new JTextField(20);
        formPanel.add(quantityField, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton addBookButton = new JButton("Add Book");
        JButton backButton = new JButton("Back to Menu");
        
        addBookButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Prototype only: Book added to inventory");
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(addBookButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 