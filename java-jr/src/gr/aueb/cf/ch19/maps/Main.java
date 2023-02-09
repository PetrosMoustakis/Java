package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, Product> products = new HashMap<>() {
            {
            put("ORA", new Product("Oranges",  10.5, 20, "ORA" ));
            put("HON", new Product("Honey", 10.5, 20, "HON"));
            put("MIL", new Product("milk", 10.5, 20, "MIL"));
            put("EGG", new Product("Eggs", 10.5, 20, "EGG"));
        }
        };

        Map<String, Object> criteria = new HashMap<>() {{
            put("description", "Eggs");
            put("price", 7.5);
        }};

        String eggs = products.values().stream()
                        .filter(pro -> pro.getDescription().equals(criteria.get("description"))
                        && (Double.compare(pro.getPrice(), (double) criteria.get("price")) > 0) )
                        .map(Product::toString)
                        .collect(Collectors.joining());

        products.entrySet().forEach(System.out::println);
        products.forEach((k,v) ->System.out.println(k + " " + v));
        String orangesStr = products.entrySet().stream()
                .filter(entry->entry.getKey().equals("ORA"))
                .map(Object::toString)
                .collect(Collectors.joining(" , "));

        System.out.println(orangesStr);

        String productsByPrice = products.entrySet().stream()
                .filter(entry->entry.getValue().getPrice() > 5.1)
                .map(Object::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(productsByPrice);

        List<Product> pros = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .collect(Collectors.toList());

        pros.forEach(System.out::println);

        int total = products.values().stream()
                .filter(product -> product.getPrice() > 5 )
                .mapToInt(Product::getQuantity)
                .sum();

        int total2 = products.values().stream()
                .filter(product -> product.getPrice() > 10.2)
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);

    }
}
