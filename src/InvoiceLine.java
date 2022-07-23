public class InvoiceLine {
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private InvoiceHeader invoiceHeader;





    public InvoiceLine(String itemName, double itemPrice, int itemcount, InvoiceHeader invoiceHeader) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemcount;
        this.invoiceHeader = invoiceHeader;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }


    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemcount() {
        return itemCount;
    }

    public void setItemcount(int itemcount) {
        this.itemCount = itemcount;
    }

    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }
    public double getLineTotal()
    {
        return itemCount *  itemPrice  ;
    }
    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemcount=" + itemCount + ", invoiceHeader=" + invoiceHeader + '}';
    }
}
