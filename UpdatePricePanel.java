import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * UpdatePricePanel - Implements the "Update Book Price" use case.
 * Allows the user to update the price of a book in the inventory.
 */
public class UpdatePricePanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField isbnField;
    private JTextField newPriceField;
    
    public UpdatePricePanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Update Book Price");
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
        
        // New Price field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("New Price:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        newPriceField = new JTextField(20);
        formPanel.add(newPriceField, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton updatePriceButton = new JButton("Update Price");
        JButton backButton = new JButton("Back to Menu");
        
        updatePriceButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Prototype only: Book price updated");
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(updatePriceButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 