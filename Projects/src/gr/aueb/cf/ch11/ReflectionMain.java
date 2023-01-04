package gr.aueb.cf.ch11;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {

    public static void main(String[] args) {

        try {
            Class <?> aClass = Class.forName("gr.aueb.cf.ch11.User");
            Class <?> bClass = Class.forName("gr.aueb.cf.ch11.UserCredentials");

            Constructor<?> defaultCtr = aClass.getConstructor();
            Object rApp1 = defaultCtr.newInstance();

            Constructor<?> defaultCtr2 = bClass.getConstructor();
            Object rApp2 = defaultCtr2.newInstance();

            Constructor<?> intId = aClass.getConstructor(Long.class);
            User id = (User) intId.newInstance(6L);

            Constructor<?> stringFirstname = aClass.getConstructor();
            Object firstname = (User) stringFirstname.newInstance("Petros");

            Constructor<?> stringLastname = aClass.getConstructor();
            Object lastname = (User) stringLastname.newInstance("Petros");

            Constructor<?> intId2 = bClass.getConstructor(Long.class);
            User id2 = (User) intId2.newInstance(15L);

            Constructor<?> stringUsername = bClass.getConstructor();
            Object username = (User) stringUsername.newInstance("Petros Mst");

            Constructor<?> stringPassword = bClass.getConstructor();
            Object password = (User) stringPassword.newInstance("12345abc");


        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
