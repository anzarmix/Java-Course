package task5;

@FunctionalInterface
interface Formatter<T> {
    String format(T value);
}
