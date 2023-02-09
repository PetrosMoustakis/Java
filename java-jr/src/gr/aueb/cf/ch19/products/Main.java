package gr.aueb.cf.ch19.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Populate
        List<Product> products = new ArrayList<>(List.of (
                                                            new Product("oranges", 2.5, 100),
                                                            new Product("eggs", 8, 6),
                                                            new Product("apples", 4.7, 5),
                                                            new Product("milk", 1.8, 1),
                                                            new Product("honey", 12.1, 1)));

        products.sort(Comparator.comparing(Product::getDescription, Comparator.reverseOrder()));
        products.sort(Comparator.comparing(Product::getDescription)
                                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                                .thenComparing(Product::getQuantity));


        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice, (a1,a2) -> Double.compare(a2, a1)));

//        Collections.sort(products, Comparator.naturalOrder());
//        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice, Comparator.naturalOrder()));
        products.forEach(System.out::println);
//
//        System.out.println();
//
//        Collections.sort(products, Comparator.reverseOrder());
//        products.forEach(System.out::println);
//
////        Collections.sort(products);
//        products.forEach(System.out::println);

        Collections.reverse(products);
        products.forEach(System.out::println);




    }


}
