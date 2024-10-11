
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TitleAndModelComparator {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Mat", 22000.0, 01));
        products.add(new Product("Table", 2000.2, 02));
        products.add(new Product("Table", 2000.2, 05));
        products.add(new Product("Table", 2000.2, 22));
        products.add(new Product("Table", 2000.2, 3));
        products.add(new Product("Table", 2000.2, 1));
        products.add(new Product("Chair", 22.4, 03));

        Comparator<Product> comparator = (p1, p2) -> {
            int p = p1.getTitle().compareTo(p2.getTitle());
            if (p != 0) {
                return p;
            }
            if (p1.getModel() > p2.getModel()) {
                return 1;
            } else if (p1.getModel() < p2.getModel()) {
                return -1;
            }
            return 0;
        };
        Collections.sort(products, comparator);

        System.out.println(products);

    }
}