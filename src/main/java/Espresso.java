public class Espresso extends Beverage{

    public Espresso(String description, double price) {
        super(description, price);
    }

    @Override
    protected double cost() {
        return getPrice();
    }
}
