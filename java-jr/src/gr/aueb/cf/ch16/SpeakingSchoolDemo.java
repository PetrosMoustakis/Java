package gr.aueb.cf.ch16;

public class SpeakingSchoolDemo {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("White");
        ISpeakable blackDog = new Dog("Black");

        // Wiring based on DI and IoC
        var genericSpeakingSchool = new GenericSpeakingSchool(whiteCat);
        var genericSpeakingSchool1 = new GenericSpeakingSchool(blackDog);
    }
}
