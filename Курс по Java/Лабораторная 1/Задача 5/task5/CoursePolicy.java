package task5;

interface CoursePolicy {
    boolean canEnroll(String student);

    default String getPolicyName() {
        return "Базовая политика";
    }
}