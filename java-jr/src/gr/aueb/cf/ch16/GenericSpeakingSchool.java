package gr.aueb.cf.ch16;

/**
 * A place where cats learn to speak.
 */

public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    public GenericSpeakingSchool(ISpeakable speakable) {
        this.speakable = speakable;
    }

    public void learnToSpeak() {
        speakable.speak();
    }

}
