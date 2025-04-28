import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * RemoveCustomerPanel - Implements the "Remove Customer" use case.
 * Allows the user to remove a customer from the system.
 */
public class RemoveCustomerPanel extends JPanel {
    private MainApp mainApp;
    private JTextField customerIdField;

    public RemoveCustomerPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());

        // Title
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Remove Customer");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);

        // Form
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill   = GridBagConstraints.HORIZONTAL;
        gbc.gridx=0; gbc.gridy=0;
        formPanel.add(new JLabel("Customer ID:"), gbc);
        gbc.gridx=1;
        customerIdField = new JTextField(20);
        formPanel.add(customerIdField, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton removeBtn = new JButton("Remove Customer");
        JButton backBtn   = new JButton("Back to Menu");
        removeBtn.addActionListener(e -> {
            int res = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to remove this customer?",
                "Confirm Removal",
                JOptionPane.YES_NO_OPTION);
            if(res == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Prototype only: Customer removed");
            }
        });
        backBtn.addActionListener(e -> mainApp.showHomePanel());
        buttonPanel.add(removeBtn);
        buttonPanel.add(backBtn);

        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}