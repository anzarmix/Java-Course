package task5;

class Course extends BaseEntity {
    private final String title;
    private final CoursePolicy policy;

    public Course(Long id, String title, CoursePolicy policy) {
        super(id);
        this.title = title;
        this.policy = policy;
    }

    public String getTitle() { return title; }
    public CoursePolicy getPolicy() { return policy; }

    @Override
    public String describe() {
        return super.describe() + " Course[" + title + "]";
    }
}