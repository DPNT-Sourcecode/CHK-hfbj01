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

    public void addDiscount(String discountKey, Discount discount) {
        discounts.put(discountKey, discount);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        int totalPrice = price * quantity;
        for(Map.Entry<String, Discount> entry: discounts.entrySet()) {
            String discountKey = entry.getKey();
            Discount discount = entry.getValue();

            int numTimesApplied = quantity / discount.getQuantity();
            totalPrice -= numTimesApplied * discount.getDiscountedPrice();
        }

        return totalPrice;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Map<String, Discount> getDiscounts() {
        return discounts;
    }

    public int getQuantity() {
        return quantity;
    }
}


