package gr.aueb.cf.ch16;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/tmp/shapes.ser"))) {
            Circle circle = new Circle();
            oos.writeObject(circle);
            Line line = new Line();
            oos.writeObject(line);
            Rectangle rectangle = new Rectangle();
            oos.writeObject(rectangle);
            System.out.println("Success in serialization");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (NotSerializableException e1) {
            System.out.println("Serializable exception" + e1);
            e1.printStackTrace();
        }catch (IOException e2) {
            System.out.println("IO Exception" + e2);
            e2.printStackTrace();
        }
    }
}
