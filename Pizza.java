public class Pizza {
    private String type;
    private int basePrice;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;

    public Pizza(String type, int basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public void setExtraToppings(boolean extraToppings) {
        this.extraToppings = extraToppings;
    }

    public void setTakeAway(boolean takeAway) {
        this.takeAway = takeAway;
    }

    public int calculateTotal() {
        int total = basePrice;
        if (extraCheese) total += 100;
        if (extraToppings) total += 150;
        if (takeAway) total += 20;
        return total;
    }

    @Override
    public String toString() {
        return "Pizza Type: " + type + "\n" +
               "Base Price: " + basePrice + "\n" +
               "Extra Cheese: " + (extraCheese ? "Yes" : "No") + "\n" +
               "Extra Toppings: " + (extraToppings ? "Yes" : "No") + "\n" +
               "Take Away: " + (takeAway ? "Yes" : "No") + "\n" +
               "Total Price: " + calculateTotal();
    }
}

