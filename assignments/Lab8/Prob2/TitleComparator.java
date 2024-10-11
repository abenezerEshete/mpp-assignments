package assignments.Lab8.Prob2;

import java.util.Comparator;
//Sort by implementing a comparator for title attribute and print product list using separate
//comparators outside the class.
public class TitleComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.title.compareTo(p2.title);
    }
}
