public class Main {
    public static void main(String[] args) {
        Tea firstTea = new Tea("Tea matcha", 150, false, true, false);
        Latte firstLatte = new Latte("Default latte", 100, true, false, true);
        Espresso firstEspresso = new Espresso("Espresso", 180, false, false, false);

        System.out.println(firstTea);
        System.out.println(firstLatte);
        System.out.println(firstEspresso);
    }
}
