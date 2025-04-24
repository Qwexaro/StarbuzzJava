public class Espresso extends Beverage{

    public Espresso(String description, double price, boolean syrup, boolean vanilla, boolean cinnamon) {
        super(description, price, syrup, vanilla, cinnamon);
    }

    @Override
    protected double cost() {
        return getPrice();
    }
}
