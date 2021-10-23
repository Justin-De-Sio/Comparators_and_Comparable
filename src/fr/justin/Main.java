package fr.justin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Toy> jouets = new ArrayList<>();
        jouets.add(new Toy("ps4", 15, "", 5));
        jouets.add(new Toy("ps5", 15, "", 16));
        jouets.add(new Toy("lego", 10, "", 0));
        jouets.add(new Toy("playmobil", 20, "", 10));
        jouets.add(new Toy("loup garou", 8, "", 0));
        Collections.sort(jouets, new PriceComparator());

        for (Toy jouet : jouets) {
            System.out.println(jouet);
        }
    }
}
