package gr.aueb.cf.ch19;

import java.util.Arrays;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        var strList = Arrays.asList("car", "cat", "camel", 5);
        Integer[] intArr = {1,2,3};

        print(list);
        print(strList);
        print(intArr);
     }

     public static void print(List<?> list) {
        list.forEach(System.out::print);
         System.out.println();
     }

     public static <T> void print(T[] arr) {
        for(T item : arr) {
            System.out.print(item);
            System.out.print(" ");
        }
     }
}
