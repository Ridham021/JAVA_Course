public class Box<T> {

    T container;

    public Box(T container) {
        this.container = container;
    }

    public T geValue()
    {
        return this.container;
    }
}
