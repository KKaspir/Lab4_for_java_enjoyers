import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grade few = new Grade("Математика", 5.0, "20.09.2023");

        ArrayList<Grade> studentGrades = new ArrayList<>();
        studentGrades.add(new Grade("Математика", 5.0, "20.09.2023"));
        studentGrades.add(new Grade("Физика", 4.5, "20.09.2023"));


        Student student = new Student("Иван", "Иванов", "01.01.2000", "12345", "ivan@example.com", studentGrades);

        ArrayList<Student> teamMembers = new ArrayList<>();
        teamMembers.add(student);

        Project project = new Project("name", "description", "1", "1", teamMembers);
        Student student2 = new Student("Второй", "Студент", "03.03.2003", "33333", "student3@example.com", studentGrades);
        Student student3 = new Student("Третий", "Студент", "03.03.2003", "33333", "student3@example.com", studentGrades);
        project.addTeamMember(student2);

        ArrayList<Event> courseEvents = new ArrayList<>();

        Course course = new Course("Программирование", "01.01.2001", "10.10.2001", "Троицкий", courseEvents);
        Event event = new Event("Конференция", "20.10.2023", "Конференц-зал", teamMembers);
        course.addEvent(event);

        System.out.println("Сейчас вручную создано 1 событие с 2 учасниками. Проверим, так ли это. После создадим еще 2 события в консоли и выведем их количество.");

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
    }
}