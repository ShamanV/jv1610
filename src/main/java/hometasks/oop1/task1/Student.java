package hometasks.oop1.task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Dinara&Shaman on 11/30/2016.
 */
public class Student {
    private static int counter;
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Calendar birthDate;
    private String address;
    private String phone;
    private String faculty;
    private String course;
    private String group;


    public Student() {
        id = ++counter;
        lastName = "Pupkin";
        firstName = "Vasay";
        middleName = "Natal'evich";
        birthDate = new GregorianCalendar(1980, 0, 1);
        address = "Bakulina Street, " + id;
        phone = "102";
        faculty = "Programmimg Tehnologies";
        course = "1";
        group = course + "01";
    }

    public Student(String lastName, String firstName, String middleName, Calendar birthDate, String address, String phone, String faculty, String course, String group) {
        this.id = ++counter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM.dd.yyyy");

        return "ID: " + id +
                "; Name: " + firstName + " " + lastName + " " + middleName +
                "; birthDate: " + dateFormat.format(birthDate.getTime()) +
                "; adddress: " + address +
                "; phone: " + phone +
                "; faculty: " + faculty +
                "; course: " + course +
                "; group: " + group;
    }
}
