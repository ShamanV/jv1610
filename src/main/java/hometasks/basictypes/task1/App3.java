package hometasks.basictypes.task1;

/**
 * Created by Dinara&Shaman on 10/17/2016.
 */
public class App3 {
    public static void main(String[] args) {
        String surname = "Смелый";
        String name = "Андрей";
        String patronymic = "Анатольевич";

        String groupPrefix = "jv";
        int groupNum = 1610;

        String day1 = "Среда";
        String time1 = "19:00";

        String day2 = "Воскресенье";
        String time2 = "9:00";

        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("номер группы: " + groupPrefix + groupNum);
        System.out.println("время занятий: " + day1 + "(" + time1 + "), " + day2 + "(" + time2 + ")");
    }
}
