import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * SellBooksPanel - Implements the "Sell Books" use case.
 * Allows the user to enter book ISBN and quantity to process a sale.
 */
public class SellBooksPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField isbnField;
    private JTextField quantityField;
    private JLabel totalPriceLabel;
    
    public SellBooksPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Sell Books");
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
        
        // Quantity field
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(new JLabel("Quantity:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        quantityField = new JTextField(20);
        formPanel.add(quantityField, gbc);
        
        // Total Price label
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(new JLabel("Total Price:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        totalPriceLabel = new JLabel("$0.00");
        formPanel.add(totalPriceLabel, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton processSaleButton = new JButton("Process Sale");
        JButton backButton = new JButton("Back to Menu");
        
        processSaleButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Prototype only: Sell Books");
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(processSaleButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 