import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * UpdateQuantityPanel - Implements the "Update Book Quantity" use case.
 * Allows the user to update the quantity of a book in the inventory.
 */
public class UpdateQuantityPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField isbnField;
    private JTextField newQuantityField;
    
    public UpdateQuantityPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Update Book Quantity");
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
        
        // New Quantity field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("New Quantity:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        newQuantityField = new JTextField(20);
        formPanel.add(newQuantityField, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton updateQuantityButton = new JButton("Update Quantity");
        JButton backButton = new JButton("Back to Menu");
        
        updateQuantityButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Prototype only: Book quantity updated");
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(updateQuantityButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 