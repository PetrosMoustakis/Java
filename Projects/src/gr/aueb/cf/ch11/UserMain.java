package gr.aueb.cf.ch11;

public class UserMain {

    public static void main(String[] args) {

        User petros = new User(6L, "Petros", "Moustakis");
        UserCredentials petrosM = new UserCredentials(15L, "Petros Mst", "12345abc");

        System.out.println(petros.getUserState());
        System.out.println(petrosM.getUserCredentialState());
    }
}
