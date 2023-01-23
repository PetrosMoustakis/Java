package gr.aueb.cf.ch16.def;

public class Main {

    public static void main(String[] args) {
        IWelcome welcomeCF = new CodingFactory();
        IWelcome welcomeC = new CodingFactory();

        welcomeCF.sayHelloCodingFactory();
        welcomeC.saySomething("Hello Coding Factory");

        IWelcome.sayHelloCoding();
    }
}
