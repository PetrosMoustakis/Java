package gr.aueb.cf.ch11_ch12;

public class StudentApp {

    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "Dylan");
        Student petros  = new Student();

        System.out.println("ID: " + bob.getId());
        System.out.println("Firstname: " + bob.getFirstname());
        System.out.println("Lastname: " + bob.getLastname());

        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        petros.setId(2);
        petros.setFirstname("Petros");
        petros.setLastname("Mst");

        System.out.println("ID: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstname());
        System.out.println("Lastname: " + alice.getLastname());

        System.out.println(Student.getStudentsCount());

    }
}
