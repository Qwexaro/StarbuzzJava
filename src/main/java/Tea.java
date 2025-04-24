public class Tea extends Beverage{
    public Tea(String description, double price) {
        super(description, price);
    }

    @Override
    protected double cost() {
        return getPrice();
    }
}
