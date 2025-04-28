import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * AddClerkPanel - Implements the "Add Clerk" use case.
 * Allows the user to add a new clerk to the system.
 */
public class AddClerkPanel extends JPanel {
    private MainApp mainApp;
    private JTextField firstNameField, lastNameField, emailField, phoneField;

    public AddClerkPanel(MainApp mainApp) {
        this.mainApp = mainApp;
        setLayout(new BorderLayout());

        // Title
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Add Clerk");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titlePanel.add(titleLabel);

        // Form
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill   = GridBagConstraints.HORIZONTAL;

        // First Name
        gbc.gridx=0; gbc.gridy=0;
        formPanel.add(new JLabel("First Name:"), gbc);
        gbc.gridx=1;
        firstNameField = new JTextField(20);
        formPanel.add(firstNameField, gbc);

        // Last Name
        gbc.gridx=0; gbc.gridy=1;
        formPanel.add(new JLabel("Last Name:"), gbc);
        gbc.gridx=1;
        lastNameField = new JTextField(20);
        formPanel.add(lastNameField, gbc);

        // Email
        gbc.gridx=0; gbc.gridy=2;
        formPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx=1;
        emailField = new JTextField(20);
        formPanel.add(emailField, gbc);

        // Phone
        gbc.gridx=0; gbc.gridy=3;
        formPanel.add(new JLabel("Phone:"), gbc);
        gbc.gridx=1;
        phoneField = new JTextField(20);
        formPanel.add(phoneField, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel();
        JButton addBtn  = new JButton("Add Clerk");
        JButton backBtn = new JButton("Back to Menu");
        addBtn.addActionListener(e ->
            JOptionPane.showMessageDialog(this, "Prototype only: Clerk added"));
        backBtn.addActionListener(e -> mainApp.showHomePanel());
        buttonPanel.add(addBtn);
        buttonPanel.add(backBtn);

        add(titlePanel, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
} 