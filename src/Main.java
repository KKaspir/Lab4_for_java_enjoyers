import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("ТЗ 1-3) Сейчас вручную создано 1 событие с 2 учасниками. Проверим, так ли это. После создадим еще 2 события в консоли и выведем их количество.");

        System.out.println("\nОбщее количество событий: " + Event.getTotalEvents());
        System.out.println("Общее количество участников: " + Event.getTotalParticipants());

        // Создаем несколько событий для тестирования
        Event event1 = Event.inputFromConsole();
        Event event2 = Event.inputFromConsole();

        // Выводим информацию о каждом событии
        System.out.println("\nИнформация о событии 1:");
        event1.printEvent();

        System.out.println("\nИнформация о событии 2:");
        event2.printEvent();

        // Выводим общее количество событий и участников
        System.out.println("\nОбщее количество событий: " + Event.getTotalEvents());
        System.out.println("Общее количество участников: " + Event.getTotalParticipants());


        System.out.println("ТЗ 9-12)");

        // Создаем массив объектов класса Student и его заполненяем
        List<Student> students = new ArrayList<>();

        Student student1 = Student.inputFromConsole();
        students.add(student1);

        Student student2 = Student.inputFromConsole();
        students.add(student2);

        // Вывод информации о каждом студенте
        for (Student student : students) {
            student.printStudent();
            System.out.println();
        }

        System.out.println("Средний бал студента 1: " + GradeHelper.calculateAverageGrade(student1));

        Grade grade1 = new Grade("Программирование", 22, "22.22.2022");
        System.out.println("\nВполне разумное использование this для создания объекта класса: " );
        grade1.printGrade();

        System.out.println("\nДомен почты студента 1: " + student1.getEmailDomain());
    }
}