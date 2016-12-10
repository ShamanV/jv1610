package hometasks.oop1.task1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Dinara&Shaman on 12/1/2016.
 */
public class App {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student());
        students.add(new Student());
        students.add(new Student());
        students.add(new Student("Semenov", "Serg", "Olegovich", new GregorianCalendar(1983, 5, 14), "Naumova Street", "104", "Hip-Hop", "3", "305"));
        students.add(new Student("Semenov2", "Serg2", "Olegovich2", new GregorianCalendar(1979, 05, 14), "Naumova Street", "104", "Hip-Hop", "3", "306"));
        students.add(new Student("Semenov3", "Serg3", "Olegovich3", new GregorianCalendar(1975, 05, 14), "Naumova Street", "104", "Hip-Hop", "4", "405"));
        students.add(new Student("Semenov4", "Serg4", "Olegovich4", new GregorianCalendar(1964, 05, 14), "Naumova Street", "104", "Hip-Hop", "4", "406"));
        students.add(new Student("Ivaniv", "Ivan", "Ivanovich", new GregorianCalendar(1993, 10, 7), "Naumova2 Street", "105", "Hop-Hip", "5", "522"));
        students.add(new Student("Ivaniv2", "Ivan2", "Ivanovich2", new GregorianCalendar(1994, 10, 7), "Naumova2 Street", "105", "Hop-Hip", "4", "422"));
        students.add(new Student("Ivaniv3", "Ivan3", "Ivanovich3", new GregorianCalendar(1994, 10, 7), "Naumova2 Street", "105", "Hop-Hip", "1", "101"));

        System.out.println("Список студентов Hip-Hop факультета");
        for (Student student : students) {
            if (student.getFaculty().equals("Hip-Hop"))
                System.out.println(student);
        }
        System.out.println();

        System.out.println("Список студентов после 1980 года рождения");
        for (Student student : students) {
            if (student.getBirthDate().get(Calendar.YEAR) > 1980)
                System.out.println(student);
        }
        System.out.println();

        System.out.println("Список студентов 101 учебной группы");
        for (Student student : students) {
            if (student.getGroup().equals("101"))
                System.out.println(student);
        }
        System.out.println();

        System.out.println("Список студентов Hip-Hop факультета 3 курса" );
        for (Student student : students) {
            if (student.getFaculty().equals("Hip-Hop") && student.getCourse().equals("3"))
                System.out.println(student);
        }
        System.out.println();
    }
}
