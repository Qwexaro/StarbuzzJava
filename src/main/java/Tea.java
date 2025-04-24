public class Tea extends Beverage{

    public Tea(String description, double price, boolean syrup, boolean vanilla, boolean cinnamon) {
        super(description, price, syrup, vanilla, cinnamon);
    }

    @Override
    protected double cost() {
        return getPrice();
    }
}
