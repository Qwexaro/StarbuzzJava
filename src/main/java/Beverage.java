public abstract class Beverage {
    private String description;
    private double price;
    private boolean syrup;
    private boolean vanilla;
    private boolean cinnamon;

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

    protected abstract double cost();
}
