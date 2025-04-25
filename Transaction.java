import java.util.List;

/**
 * Transaction — group of lines with transaction metadata.
 */
public class Transaction {
    private int id;
    private String date;
    private int custId;
    private String custName;
    private List<TransactionLine> lines;
    
    public Transaction(int id, String date, int custId, String custName, List<TransactionLine> lines) {
        this.id       = id;
        this.date     = date;
        this.custId   = custId;
        this.custName = custName;
        this.lines    = lines;
    }
    public int    getId()       { return id; }
    public String getDate()     { return date; }
    public int    getCustId()   { return custId; }
    public String getCustName() { return custName; }
    public List<TransactionLine> getLines() { return lines; }
} 