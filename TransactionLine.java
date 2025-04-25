/**
 * TransactionLine — one line item (ISBN, qty, price) in a transaction.
 */
public class TransactionLine {
    private String isbn;
    private int qty;
    private double linePrice;
    public TransactionLine(String isbn, int qty, double linePrice) {
        this.isbn      = isbn;
        this.qty       = qty;
        this.linePrice = linePrice;
    }
    public String getIsbn()      { return isbn; }
    public int    getQty()       { return qty; }
    public double getLinePrice() { return linePrice; }
} 