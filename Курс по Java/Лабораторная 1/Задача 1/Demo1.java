record Course(String title, String description, int hours) {}   

interface CourseFormatter {                                      
    String format(Course course);
}

class CompactCourseFormatter implements CourseFormatter {        
    @Override public String format(Course course) {
        return course.title();
    }
}

class DetailedCourseFormatter implements CourseFormatter {       
    @Override public String format(Course course) {
        return course.title() + " | " + course.description() + " | " + course.hours() + "h";
    }
}

public class Demo1 {                                             
    public static void main(String[] args) {
        Course course = new Course("Java", "OOP + FP", 40);
        CourseFormatter f1 = new CompactCourseFormatter();
        CourseFormatter f2 = new DetailedCourseFormatter();
        System.out.println(f1.format(course));
        System.out.println(f2.format(course));
    }
}