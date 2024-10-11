package assignments.Lab8.Prob2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Mat", 22000.0, 01));
        products.add(new Product("Table", 2000.2, 02));
        products.add(new Product("Chair", 22.4, 03));

        Collections.sort(products, new PriceComparator());
        System.out.println(products);

        Collections.sort(products, new TitleComparator());
        System.out.println(products);
    }
}
