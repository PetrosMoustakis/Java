package gr.aueb.cf.ch19;

public class Main {
    public static void main(String[] args) {

        Node<Integer> intNode = new Node<>();
        Node<String> strNode = new Node<>();

        for (var i = 0; i <= 10; i ++) {
            System.out.println(i);
        }

        intNode.setItem(1);
        strNode.setItem("CF");

//        int data = strNode.getItem();
    }
}
