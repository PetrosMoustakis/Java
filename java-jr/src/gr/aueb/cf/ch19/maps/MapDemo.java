package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>() {
            {
                put("Gre", "Greece");
                put("FR", "France");
            }
        };

        // >= Java9
        Map<String, String> countries2 = Map.of(
                "USA", "Unites states of America",
                "IT", "Italy"
        );

        Map<String, String> countries3 = new HashMap<String, String>(
                Map.of("USA", "Unites states of America",
                        "IT", "Italy")
        );

        countries.put("DE", "Germany");
        countries.put("FI", "Finland");

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
