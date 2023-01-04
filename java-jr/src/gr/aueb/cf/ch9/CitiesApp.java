//package gr.aueb.cf.ch9;
//
//import java.io.*;
//import java.nio.charset.StandardCharsets;
//
///**
// * java.io
// */
//public class CitiesApp {
//
//    public static void main(String[] args) {
//       String line;
//       String[] cities = null;
//       File dir = new File("C:/tmp/io");
//
//       if (!dir.exists()) {
//           if(!dir.mkdir()) {
//               System.out.println("Error in make dir");
//               System.exit(1);
//           }
//       }
//
//       try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/cities.txt"))) {
//         File grFile, deFile, usaFile = null;
//
//         while ((line = bf.readLine()) != null) {
//             cities = line.split("+");
//
//             String country = cities[0];
//             switch (country) {
//                 case "Greece":
//                     grFile = new File(dir + "/" + "gr.txt");
//                     PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
//                     print(gr, "GR cities");
//                     print(gr, cities);
//                     break;
//                 case "USA":
//                     grFile = new File(dir + "/" + "usa.txt");
//                     PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
//                     print(usa, "USA cities");
//                     print(usa, cities);
//                     break;
//                 case "Germany":
//                     grFile = new File(dir + "/" + "de.txt");
//                     PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
//                     print(de, "Germany cities");
//                     print(de, cities);
//                     break;
//                 default:
//                     System.out.println("Error");
//             }
//         }
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//    }
//
//
//    public static void print(PrintStream ps, String[] tokens) {
//        for (int i = 1; i < tokens.length; i++) {
//            ps.print(tokens[i] + " ");
//        }
//    }
//
//    public static void print(PrintStream ps, String message) {
//        ps.println(message);
//    }
//}
