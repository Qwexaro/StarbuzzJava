public class Latte extends Beverage{
    public Latte(String description, double price) {
        super(description, price);
    }

    @Override
    protected double cost() {
        return getPrice();
    }
}
