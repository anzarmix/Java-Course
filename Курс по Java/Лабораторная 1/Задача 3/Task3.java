class Course {
    private final String title;
    private final String instructor;
    private final int duration;
    private final double price;

    public Course(String title, String instructor, int duration, double price) {
        this.title = title;
        this.instructor = instructor;
        this.duration = duration;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getInstructor() { return instructor; }
    public int getDuration() { return duration; }
    public double getPrice() { return price; }
}

interface CourseFormatter {
    String format(Course course);
}

class SimpleFormatter implements CourseFormatter {
    @Override
    public String format(Course course) {
        return course.getTitle() + " - " + course.getInstructor();
    }
}

class DetailedFormatter implements CourseFormatter {
    @Override
    public String format(Course course) {
        return String.format("Курс: %s | Преподаватель: %s | Длительность: %d часов | Цена: %.2f руб.",
                course.getTitle(), course.getInstructor(), course.getDuration(), course.getPrice());
    }
}

class PriceFormatter implements CourseFormatter {
    @Override
    public String format(Course course) {
        return String.format("[%s] Стоимость: %.2f руб. (%.2f руб./час)",
                course.getTitle(), course.getPrice(), 
                course.getPrice() / course.getDuration());
    }
}

public class Task3 {
    public static void main(String[] args) {
        Course course = new Course("Java", "Нигматулин Руслан Раульевич", 40, 15000.0);
        
        CourseFormatter[] formatters = {
            new SimpleFormatter(),
            new DetailedFormatter(),
            new PriceFormatter()
        };

        for (CourseFormatter formatter : formatters) {
            System.out.println(formatter.format(course));
            System.out.println("---");
        }
    }
}