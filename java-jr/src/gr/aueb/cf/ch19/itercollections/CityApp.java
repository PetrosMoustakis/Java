package gr.aueb.cf.ch19.itercollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityApp {

    public static void main(String[] args) {
//        Populate
//        List<String> cities = List.of("Athens", "London", "Paris");
        List<String> cities = new ArrayList<>(List.of("Athens", "London", "Paris"));
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4));

//        Traverse
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }

        for (String city : cities) {
            System.out.println(city);
        }

        cities.forEach(System.out::println);

        Iterator<String> it = cities.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
           if (s.equals("Paris")) it.remove();
//            if (s.equals("London")) cities.remove(s);
        }

        cities.removeIf(s->s.equals("London"));

        cities.forEach(System.out::println);

        Iterator<Integer> num = numbers.iterator();

        while (num.hasNext()) {
            String i = Integer.toString(num.next());
            System.out.print(i + " ");

            if(i.equals("2")) num.remove();

        }
        System.out.println();
        numbers.forEach(System.out::print);

    }
}

