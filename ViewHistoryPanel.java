import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ViewHistoryPanel - Implements the "View Purchase History" use case.
 * Allows the user to view a customer's purchase history.
 */
public class ViewHistoryPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField customerIdField;
    private JTextArea historyArea;
    
    public ViewHistoryPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("View Purchase History");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);
        
        // Create form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Customer ID field
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Customer ID:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        customerIdField = new JTextField(20);
        formPanel.add(customerIdField, gbc);
        
        // History area
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        formPanel.add(new JLabel("Purchase History:"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        historyArea = new JTextArea(10, 30);
        historyArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(historyArea);
        formPanel.add(scrollPane, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton viewHistoryButton = new JButton("View History");
        JButton backButton = new JButton("Back to Menu");
        
        viewHistoryButton.addActionListener(e -> {
            // Display placeholder purchase history
            historyArea.setText("Prototype only: Purchase history for customer " + customerIdField.getText() + "\n\n" +
                              "Transaction #1001 - 2023-05-15 - $45.99\n" +
                              "Transaction #1002 - 2023-06-01 - $32.50\n" +
                              "Transaction #1003 - 2023-06-15 - $78.25");
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(viewHistoryButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 