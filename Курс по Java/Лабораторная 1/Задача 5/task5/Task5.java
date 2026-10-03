package task5;

public class Task5 {
    public static void main(String[] args) {
        Course course = new Course(1L, "Java",
                student -> student != null && !student.isBlank());

        System.out.println("ID курса: " + course.getId());
        System.out.println("Политика: " + course.getPolicy().getPolicyName());
        System.out.println("Можно записаться 'Анна': " + course.getPolicy().canEnroll("Анна"));
        System.out.println("Можно записаться '': " + course.getPolicy().canEnroll(""));

        System.out.println("Описание: " + course.describe());
        System.out.println("Создан: " + course.getCreatedAt());

        Formatter<Course> formatter = c -> c.getTitle() + " (ID: " + c.getId() + ")";
        System.out.println("Формат: " + formatter.format(course));

        System.out.println("Сейчас: " + ClockProvider.now());
        System.out.println("Фиксированное время: " + ClockProvider.fixed("2025-01-20T15:00"));
    }
}