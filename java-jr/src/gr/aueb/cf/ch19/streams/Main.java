package gr.aueb.cf.ch19.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("oranges", 2.5, 100),
                new Product("eggs", 8, 6),
                new Product("apples", 4.7, 5),
                new Product("milk", 1.8, 1),
                new Product("honey", 12.1, 1)));

        List<Product> oranges = products.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                .collect(Collectors.toList());

        products.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                .forEach(System.out::println);

        List<Product> notOranges = products.stream()
                .filter(product -> product.getDescription().equals("Oranges"))
                .sorted(Comparator.comparing(Product::getDescription))
                .collect(Collectors.toList());

        List<Double> prices = products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());

        List<Product> updatedProductPrices = products.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() * 0.2 ,p.getQuantity()))
                .collect(Collectors.toList());

        int orangesTotalCount = products.stream()
                .filter(p -> p.getDescription().equals("Oranges"))
                .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        int orangesSum = products.stream()
                .filter(p -> p.getDescription().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();
    }
}
