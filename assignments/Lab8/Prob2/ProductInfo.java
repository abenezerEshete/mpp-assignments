package assignments.Lab8.Prob2;

import java.util.*;

public class ProductInfo {
    enum SortMethod {BYPRICE,BYTITLE};

    public void sorter(List<Product> products , SortMethod method ){
        //making comparators inner classes
        class ProductComparator implements Comparator<Product>{
            @Override
            public int compare(Product p1, Product p2) {
               if(method == SortMethod.BYTITLE){
                   return p1.title.compareTo(p2.title);
               }else{
                   if(p1.price == p2.price) return 0;
                   else if (p1.price > p2.price) return 1;
                   else return -1;
               }
            }
        }
        Collections.sort(products,new ProductComparator());
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Shoe", 2000.0, 01));
        products.add(new Product("LVBag", 5400.2, 02));
        products.add(new Product("DG", 224.4, 03));

        //create object of class
        ProductInfo pi = new ProductInfo();
        System.out.println("SORTING BY PRICE");
        pi.sorter(products,SortMethod.BYPRICE);
        System.out.println(products);
        System.out.println("------------------");
        System.out.println("SORTING BY TITLE");
        pi.sorter(products,SortMethod.BYTITLE);
        System.out.println(products);


    }
}
