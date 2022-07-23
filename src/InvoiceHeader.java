import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int num;
    private String customerName;
    private Date invoiceDate;
    private ArrayList<InvoiceLine> invoiceLines;
    public InvoiceHeader(int num, String customerName, Date invoiceDate) {
        this.num = num;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;

    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "num=" + num + ", customerName=" + customerName + ", invoiceDate=" + invoiceDate + '}';
    }

    public ArrayList<InvoiceLine> getInvoiceLines() {
        if (invoiceLines==null);
        invoiceLines=new ArrayList<>();
        return invoiceLines;
    }

    public double getInvoiceTotal(){
        return 0.0;
    }
    public double getLineTotal(){
        double total=0.0;
        for(InvoiceLine line:getInvoiceLines())
        {
            total +=line.getLineTotal();
        }
        return total;
    }
    public void addInvoiceLine(InvoiceLine line){
        getInvoiceLines().add(line);
    }


    public void setInvoiceLines(ArrayList<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
}
