public class Box<T> {
    private T args;

    public Box(T args) {
        this.args = args;
    }

    public T getArgs() {
        return args;
    }

    public void setArgs(T args) {
        this.args = args;
    }

    public static <T> Object method(T args) {
        return method(args);
    }

    @Override
    public String toString() {
        return "Box{" +
                "args=" + args +
                '}';
    }
}
