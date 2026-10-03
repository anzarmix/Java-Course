package task5;

abstract class BaseEntity implements Identifiable {
    private final Long id;
    private final String createdAt;

    protected BaseEntity(Long id) {
        this.id = id;
        this.createdAt = java.time.LocalDateTime.now().toString();
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String describe() {
        return "Entity[id=" + id + ", created=" + createdAt + "]";
    }
}