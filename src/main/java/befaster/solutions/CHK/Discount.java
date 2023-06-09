package befaster.solutions.CHK;

public class Discount {

    private String discountType;
    private int quantity;
    private int discountedPrice;

    public Discount(String discountType, int quantity, int discountedPrice) {
        this.discountType = discountType;
        this.quantity = quantity;
        this.discountedPrice = discountedPrice;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(int discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}

