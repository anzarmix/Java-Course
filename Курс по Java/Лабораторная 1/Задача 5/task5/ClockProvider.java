package task5;

final class ClockProvider {
    private ClockProvider() {}

    static String now() {
        return java.time.LocalDateTime.now().toString();
    }

    static String fixed(String time) {
        return time;
    }
}
