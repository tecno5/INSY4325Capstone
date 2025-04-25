import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * RemoveInventoryPanel - Implements the "Remove Inventory" use case.
 * Allows the user to remove a book from the inventory.
 */
public class RemoveInventoryPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField isbnField;
    
    public RemoveInventoryPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Remove Inventory");
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
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton removeBookButton = new JButton("Remove Book");
        JButton backButton = new JButton("Back to Menu");
        
        removeBookButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to remove this book from inventory?", 
                "Confirm Removal", 
                JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Prototype only: Book removed from inventory");
            }
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(removeBookButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 