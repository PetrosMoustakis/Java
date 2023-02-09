package gr.aueb.cf.ch20;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface TeacherIDChecker {
    boolean checkId(Teacher teacher);
}

public class Main {
    private static List<Teacher> teachers = Arrays.asList(
            new Teacher(1, "Pe.", "mst"),
            new Teacher(2, "Kw.", "ale"),
            new Teacher(3, "Ni", "gew"),
            new Teacher(1, "Gio.", "pro")
    );

    public static void main(String[] args) {

        int id = 3;

//        printEquals(teachers, new TeacherIDChecker() {
//            @Override
//            public boolean checkId(Teacher teacher) {
//                return teacher.getTeacherId() == 1;
//            }
//        });

//        printEqualId(teachers, (teacher) -> teacher.getTeacherId() == 2);

        printEqualId(teachers,teacher -> teacher.getTeacherId() == id,
                Teacher::printTeacher);

        printEqualId(teachers, teacher -> teacher.getTeacherId()> id,
                Teacher::printFullName );
    }

    public static void  printEquals(List<Teacher> teachers, int teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherID) {
                System.out.println("Full Name: " + teacher.getFirstname()
                + ", " + teacher.getLastname());
            }
        }
    }

    public static void printGreaterThanID(List<Teacher> teachers,int teacherID) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > teacherID) {
                System.out.println("Full Name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }

    public static void printEqualId(List<Teacher> teachers,TeacherIDChecker teacherIDChecker) {
        for (Teacher teacher : teachers) {
            if (teacherIDChecker.checkId(teacher)) {
                System.out.println("Full Name: " + teacher.getFirstname()
                        + ", " + teacher.getLastname());
            }
        }
    }

//    public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker, Consumer<Teacher> teacherConsume) {
//        for (Teacher teacher : teachers) {
//            if (checker.test(teacher)) {
//                teacherConsume.accept(teacher);
//            }
//        }
//    }

    public static void printEqualId(List<Teacher> teachers, Predicate<Teacher> checker, Consumer<Teacher> teacherConsume) {
        teachers.forEach(teacher -> {if (checker.test(teacher)) teacherConsume.accept(teacher);});
    }

    public static void printGreaterThanId(List<Teacher> teachers, Predicate<Teacher> checker, Consumer<Teacher> teacherConsume) {
        teachers.forEach(teacher -> {if (checker.test(teacher)) teacherConsume.accept(teacher);});
    }

}
