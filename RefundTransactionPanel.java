import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * RefundTransactionPanel - Implements the "Refund Transaction" use case.
 * Allows the user to enter a transaction ID and process a refund.
 */
public class RefundTransactionPanel extends JPanel {
    
    private MainApp mainApp;
    private JTextField transactionIdField;
    private JTextArea transactionDetailsArea;
    
    public RefundTransactionPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());
        
        // Create title panel
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Refund Transaction");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);
        
        // Create form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Transaction ID field
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(new JLabel("Transaction ID:"), gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        transactionIdField = new JTextField(20);
        formPanel.add(transactionIdField, gbc);
        
        // Transaction details area
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        formPanel.add(new JLabel("Transaction Details:"), gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        transactionDetailsArea = new JTextArea(10, 30);
        transactionDetailsArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(transactionDetailsArea);
        formPanel.add(scrollPane, gbc);
        
        // Create button panel
        JPanel buttonPanel = new JPanel();
        JButton processRefundButton = new JButton("Process Refund");
        JButton backButton = new JButton("Back to Menu");
        
        processRefundButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(this, 
                "Are you sure you want to process this refund?", 
                "Confirm Refund", 
                JOptionPane.YES_NO_OPTION);
            
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Prototype only: Refund processed");
            }
        });
        
        backButton.addActionListener(e -> mainApp.showHomePanel());
        
        buttonPanel.add(processRefundButton);
        buttonPanel.add(backButton);
        
        // Add panels to main panel
        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 