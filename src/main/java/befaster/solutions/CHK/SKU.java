package befaster.solutions.CHK;

import java.util.Map;

public class SKU {

    private String id;
    private int price;
    private Map<String, Discount> discounts;
    private int quantity;

    public SKU(String id, int price, Map<String, Discount> discounts, int quantity) {
        this.id = id;
        this.price = price;
        this.discounts = discounts;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Map<String, Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Map<String, Discount> discounts) {
        this.discounts = discounts;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

