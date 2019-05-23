package homework1;

/**
 * CustomStack class.
 */
public class CustomStack<T> {
    CustomList<T> customStack;

    /**
     * CustomStack constructor.
     */
    public CustomStack() {
        this.customStack = new CustomList<>();
    }

    /**
     * Function that add value into the stack.
     *
     * @param value T value
     */
    public void push(T value) {
        this.customStack.addLast(value);
    }

    /**
     * Function that remove value into the Stack.
     *
     * @return removed Node.
     */
    public Node pop() {
        Node item_removed = this.customStack.getFirst();
        this.customStack.removeLast();
        return item_removed;
    }

    /**
     * Function that return the first element of stack.
     *
     * @return Node.
     */
    public Node peek() {
        return this.customStack.getLast();
    }
}
