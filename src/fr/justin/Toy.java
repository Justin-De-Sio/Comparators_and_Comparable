package fr.justin;

public class Toy implements Comparable<Toy> {
    private final String name;
    private final int price;
    private final String desc;
    private final int promo;

    public Toy(String name, int price, String desc, int promo) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.promo = promo;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", promo=" + promo +
                '}';
    }


    @Override
    public int compareTo(Toy toy) {
        return toy.promo - this.promo;
    }
}
