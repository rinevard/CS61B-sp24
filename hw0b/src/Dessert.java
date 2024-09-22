public class Dessert {
    private int flavor;
    private int price;
    private static int numDesserts;

    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts += 1;
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }

    public void printDessert() {
        System.out.printf("%d %d %d", flavor, price, numDesserts);
    }
}
