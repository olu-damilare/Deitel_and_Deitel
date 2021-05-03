package chapterTen;

public class Invoice implements Payable {
    private final String productNumber;
    private double pricePerItem;
    private final String productDescription;
    private int quantity;

    public Invoice(String productNumber, String productDescription, int quantity, double pricePerItem) {
        validateQuantity(quantity);
        validatePrice(pricePerItem);
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;

    }

    private void validatePrice(double pricePerItem) {
        if(pricePerItem < 0)
            throw new IllegalArgumentException("price must be >= 0");
    }

    private void validateQuantity(int quantity) {
        if(quantity < 0)
            throw new IllegalArgumentException("Quantity must be >= 0");
    }

    @Override
    public double calculatePaymentAmount() {
        return getQuantity() * getPricePerItem();
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return  "Invoice\n" +
                "Product Number = " + productNumber + '\n' +
                "Price per Item = " + pricePerItem + '\n' +
                "Product Description = " + productDescription + '\n' +
                "Quantity = " + quantity + '\n' +
                "Amount payable = " + calculatePaymentAmount();
    }

    public void setQuantity(int quantity) {
        validateQuantity(quantity);
        this.quantity = quantity;
    }

    public void setPricePerItem(int pricePerItem) {
        validatePrice(pricePerItem);
        this.pricePerItem = pricePerItem;
    }
}
