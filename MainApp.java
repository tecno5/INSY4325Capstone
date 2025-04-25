import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Map;
import java.util.List;

/**
 * MainApp - The main application window for the Bookstore System Prototype.
 * This class serves as the container for all use case panels and handles navigation.
 */
public class MainApp extends JFrame {
    
    private CardLayout cardLayout;
    private JPanel contentPanel;
    
    // --- STATIC SAMPLE DATA -----------------------------------
    private Map<String,BookRecord> sampleBooks = Map.of(
        "0385550367", new BookRecord(
            "James", "Percival Everett", 29.99
        ),
        "0804172706", new BookRecord(
            "A Little Life", "Hanya Yanagihara", 13.99
        ),
        "0593797124", new BookRecord(
            "Sift: The Elements of Great Baking", "Nicola Lamb", 24.99
        )
    );

    private List<Transaction> sampleTransactions = List.of(
        new Transaction(
            100, "9/2/2024", 23, "Jean Mack",
            List.of(new TransactionLine("0385550367", 1, 29.99))
        ),
        new Transaction(
            102, "9/2/2024", 154, "Alicia Moore",
            List.of(new TransactionLine("0593797124", 2, 24.99))
        ),
        new Transaction(
            110, "9/5/2024", 72, "Shane Wesley",
            List.of(new TransactionLine("0593312047", 1, 23.99))
        )
    );
    // ----------------------------------------------------------
    
    // Panel names for CardLayout
    public static final String SELL_BOOKS_PANEL = "SellBooksPanel";
    public static final String REFUND_TRANSACTION_PANEL = "RefundTransactionPanel";
    public static final String ADD_INVENTORY_PANEL = "AddInventoryPanel";
    public static final String UPDATE_PRICE_PANEL = "UpdatePricePanel";
    public static final String UPDATE_QUANTITY_PANEL = "UpdateQuantityPanel";
    public static final String REMOVE_INVENTORY_PANEL = "RemoveInventoryPanel";
    public static final String ADD_CUSTOMER_PANEL = "AddCustomerPanel";
    public static final String VIEW_HISTORY_PANEL = "ViewHistoryPanel";
    public static final String HOME_PANEL = "HomePanel";
    
    public MainApp() {
        // Set up the main frame
        setTitle("Bookstore System Prototype");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Create the card layout and content panel
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);
        
        // Create menu bar
        createMenuBar();
        
        // Create and add all panels
        createPanels();
        
        // Add content panel to the frame
        add(contentPanel, BorderLayout.CENTER);
        
        // Show the home panel initially
        cardLayout.show(contentPanel, HOME_PANEL);
    }
    
    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        
        // Sales Menu
        JMenu salesMenu = new JMenu("Sales");
        JMenuItem sellBooksItem = new JMenuItem("Sell Books");
        JMenuItem refundTransactionItem = new JMenuItem("Refund Transaction");
        
        sellBooksItem.addActionListener(e -> cardLayout.show(contentPanel, SELL_BOOKS_PANEL));
        refundTransactionItem.addActionListener(e -> cardLayout.show(contentPanel, REFUND_TRANSACTION_PANEL));
        
        salesMenu.add(sellBooksItem);
        salesMenu.add(refundTransactionItem);
        
        // Inventory Menu
        JMenu inventoryMenu = new JMenu("Inventory");
        JMenuItem addInventoryItem = new JMenuItem("Add New Inventory");
        JMenuItem updatePriceItem = new JMenuItem("Update Book Price");
        JMenuItem updateQuantityItem = new JMenuItem("Update Book Quantity");
        JMenuItem removeInventoryItem = new JMenuItem("Remove Inventory");
        
        addInventoryItem.addActionListener(e -> cardLayout.show(contentPanel, ADD_INVENTORY_PANEL));
        updatePriceItem.addActionListener(e -> cardLayout.show(contentPanel, UPDATE_PRICE_PANEL));
        updateQuantityItem.addActionListener(e -> cardLayout.show(contentPanel, UPDATE_QUANTITY_PANEL));
        removeInventoryItem.addActionListener(e -> cardLayout.show(contentPanel, REMOVE_INVENTORY_PANEL));
        
        inventoryMenu.add(addInventoryItem);
        inventoryMenu.add(updatePriceItem);
        inventoryMenu.add(updateQuantityItem);
        inventoryMenu.add(removeInventoryItem);
        
        // Customers Menu
        JMenu customersMenu = new JMenu("Customers");
        JMenuItem addCustomerItem = new JMenuItem("Add Customer");
        JMenuItem viewHistoryItem = new JMenuItem("View Purchase History");
        
        addCustomerItem.addActionListener(e -> cardLayout.show(contentPanel, ADD_CUSTOMER_PANEL));
        viewHistoryItem.addActionListener(e -> cardLayout.show(contentPanel, VIEW_HISTORY_PANEL));
        
        customersMenu.add(addCustomerItem);
        customersMenu.add(viewHistoryItem);
        
        // Add menus to menu bar
        menuBar.add(salesMenu);
        menuBar.add(inventoryMenu);
        menuBar.add(customersMenu);
        
        // Set the menu bar
        setJMenuBar(menuBar);
    }
    
    private void createPanels() {
        // Create a home panel
        JPanel homePanel = new JPanel(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to Bookstore System Prototype", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        homePanel.add(welcomeLabel, BorderLayout.CENTER);
        
        // Add all panels to the content panel
        contentPanel.add(homePanel, HOME_PANEL);
        contentPanel.add(new SellBooksPanel(this), SELL_BOOKS_PANEL);
        contentPanel.add(new RefundTransactionPanel(this), REFUND_TRANSACTION_PANEL);
        contentPanel.add(new AddInventoryPanel(this), ADD_INVENTORY_PANEL);
        contentPanel.add(new UpdatePricePanel(this), UPDATE_PRICE_PANEL);
        contentPanel.add(new UpdateQuantityPanel(this), UPDATE_QUANTITY_PANEL);
        contentPanel.add(new RemoveInventoryPanel(this), REMOVE_INVENTORY_PANEL);
        contentPanel.add(new AddCustomerPanel(this), ADD_CUSTOMER_PANEL);
        contentPanel.add(new ViewHistoryPanel(this), VIEW_HISTORY_PANEL);
    }
    
    // Method to navigate back to home panel
    public void showHomePanel() {
        cardLayout.show(contentPanel, HOME_PANEL);
    }
} 