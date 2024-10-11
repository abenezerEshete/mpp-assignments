package assignments.Lab8.Prob2;

import java.util.Comparator;

//Sort by implementing a comparator for price attributes and printing the product list using separate comparators outside the class.
public class PriceComparator implements Comparator<Product> {
@Override
    public int compare(Product p1, Product p2){
    //i can have either
    return Double.compare(p1.price,p2.price);
    //or
   // return Double.valueOf(p1.price).compareTo(Double.valueOf(p2.price));

}
}
