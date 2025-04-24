public abstract class Beverage {
    private String description;
    private double price;
    private boolean syrup;
    private boolean vanilla;
    private boolean cinnamon;

    public final double PRICE_SYRUP = 30;
    public final double PRICE_VANILLA = 30;
    public final double PRICE_CINNAMON = 30;

    public Beverage(String description, double price, boolean syrup, boolean vanilla, boolean cinnamon) {
        this.description = description;
        this.price = price;
        this.syrup = syrup;
        this.vanilla = vanilla;
        this.cinnamon = cinnamon;
    }


    public double getPrice() {
        return price;
    }

    public boolean isSyrup() {
        return syrup;
    }

    public boolean isVanilla() {
        return vanilla;
    }

    public boolean isCinnamon() {
        return cinnamon;
    }

    public String getDescription() {
        return description;
    }

    protected double cost() {
        double totalPrice = getPrice();
        if (isSyrup()) {
            totalPrice += PRICE_SYRUP;
        }
        if (isVanilla()) {
            totalPrice += PRICE_VANILLA;
        }
        if (isCinnamon()) {
            totalPrice += PRICE_CINNAMON;
        }
        return totalPrice;


    }

    @Override
    public String toString() {
        return "Beverage{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", syrup=" + syrup +
                ", vanilla=" + vanilla +
                ", cinnamon=" + cinnamon +
                ", total price=" + cost() +
                '}';
    }
}
