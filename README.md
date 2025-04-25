# Bookstore System Prototype

A Java Swing desktop prototype demonstrating a simple Bookstore System with eight use‐cases and full menu/navigation.  
No real database or business logic—just a GUI skeleton with placeholder actions and a bit of static sample data.'

Made for INSY 4325 Capstone Systems development Protoype

---

## Features

- **Main Window**  
  - `MainApp` extends `JFrame`  
  - CardLayout navigation (Home + eight panels)  
  - JMenuBar with three menus (Sales / Inventory / Customers)  

- **Eight Use-Case Panels**  
  1. Sell Books  
  2. Refund Transaction  
  3. Add New Inventory  
  4. Update Book Price  
  5. Update Book Quantity  
  6. Remove Inventory  
  7. Add Customer  
  8. View Purchase History  

- **Static Sample Data**  
  - `BookRecord`  
  - `TransactionLine` / `Transaction`  
  - A handful of hard-coded books & transactions in `MainApp`

---

## Prerequisites

- Java 8 or higher  
- (Optional) An IDE (IntelliJ IDEA, Eclipse, VS Code)  

---

## Build & Run

1. Open terminal / command prompt in project root (where all `.java` files live).  
2. Compile all classes:
   ```bash
   javac *.java
   ```
3. Launch the GUI:
   ```bash
   java Main
   ```

---

## Project Structure
- **Main.java**  
  Entry point. Invokes `MainApp` on the Swing Event Dispatch Thread.

- **MainApp.java**  
  - Sets up frame, menu bar, CardLayout.  
  - Holds static `Map<String,BookRecord>` and `List<Transaction>` sample data.  
  - Instantiates and registers all eight panels + home screen.

- **BookRecord.java, TransactionLine.java, Transaction.java**  
  Simple DTOs to represent books & transactions.

- **XXXPanel.java**  
  One panel per use case—each with its specific form fields, buttons, “Back to Menu,” and placeholder `JOptionPane` actions.

---

## Sample Data

Inside `MainApp.java` you’ll find:

Panels such as “Sell Books,” “View Purchase History,” etc., can read from these collections to display fixed sample values.

---
