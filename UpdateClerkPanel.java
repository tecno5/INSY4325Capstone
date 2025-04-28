import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * UpdateClerkPanel - Implements the "Update Clerk" use case.
 * Allows the user to update an existing clerk's information.
 */
public class UpdateClerkPanel extends JPanel {
    private MainApp mainApp;
    private JTextField clerkIdField, firstNameField, lastNameField, emailField, phoneField;

    public UpdateClerkPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());

        // Title
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Update Clerk");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);

        // Form
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill   = GridBagConstraints.HORIZONTAL;

        // Clerk ID
        gbc.gridx=0; gbc.gridy=0;
        formPanel.add(new JLabel("Clerk ID:"), gbc);
        gbc.gridx=1;
        clerkIdField = new JTextField(20);
        formPanel.add(clerkIdField, gbc);

        // First Name
        gbc.gridx=0; gbc.gridy=1;
        formPanel.add(new JLabel("First Name:"), gbc);
        gbc.gridx=1;
        firstNameField = new JTextField(20);
        formPanel.add(firstNameField, gbc);

        // Last Name
        gbc.gridx=0; gbc.gridy=2;
        formPanel.add(new JLabel("Last Name:"), gbc);
        gbc.gridx=1;
        lastNameField = new JTextField(20);
        formPanel.add(lastNameField, gbc);

        // Email
        gbc.gridx=0; gbc.gridy=3;
        formPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx=1;
        emailField = new JTextField(20);
        formPanel.add(emailField, gbc);

        // Phone
        gbc.gridx=0; gbc.gridy=4;
        formPanel.add(new JLabel("Phone:"), gbc);
        gbc.gridx=1;
        phoneField = new JTextField(20);
        formPanel.add(phoneField, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton updateBtn = new JButton("Update Clerk");
        JButton backBtn   = new JButton("Back to Menu");
        updateBtn.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Prototype only: Clerk updated"));
        backBtn.addActionListener(e -> mainApp.showHomePanel());
        buttonPanel.add(updateBtn);
        buttonPanel.add(backBtn);

        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 