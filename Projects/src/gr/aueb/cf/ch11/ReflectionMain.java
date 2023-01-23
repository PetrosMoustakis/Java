package gr.aueb.cf.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionMain {

    public static void main(String[] args) {

        try {
            Class <?> aClass = Class.forName("gr.aueb.cf.ch11.User");
            Class <?> bClass = Class.forName("gr.aueb.cf.ch11.userCredentials");
//            class <?> cClass = Class.for("gr.aueb.cf.ch11.Main");

//           Get default constructor and create instance
            Constructor<?> defaultCtr = aClass.getConstructor();
            defaultCtr.setAccessible(true);
            User user1 = (User) defaultCtr.newInstance();

            Constructor<?> defaultCtr2 = bClass.getConstructor();
            defaultCtr2.setAccessible(true);
            userCredentials userCredentials1 = (userCredentials) defaultCtr2.newInstance();

//            Get overloaded constructor and create an instance
            Constructor<?> intId = aClass.getConstructor(Long.class, String.class, String.class);
            User user2 = (User) intId.newInstance(6L, "Petros", "Moustakis");

            Constructor<?> intId2 = bClass.getConstructor(Long.class, String.class, String.class);
            userCredentials userCredentials2 = (userCredentials) intId2.newInstance(15L, "Petros Mst", "12345abc");

//          Get methods
            Method getUserState = aClass.getMethod("getUserState");
            getUserState.invoke(user2);
            Class<?> returnParam = getUserState.getReturnType();

            Method getUserCredentialState = bClass.getMethod("getUserCredentialState");
            getUserCredentialState.invoke(userCredentials2);
            Class<?> returnState = getUserCredentialState.getReturnType();

            System.out.println();

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
