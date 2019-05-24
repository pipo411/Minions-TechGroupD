package homework1;

public class CustomQueue<T> {
    CustomList<T> customQueue;

    /**
     * CustomQueue Constructor.
     */
    public CustomQueue() {
        this.customQueue = new CustomList<>();
    }

    /**
     * Function that add value into the queue.
     *
     * @param value T value
     */
    public void add(T value) {
        this.customQueue.addLast(value);
    }

    /**
     * Function that remove value into the queue.
     *
     * @return removed Node.
     */
    public Node remove() {
        Node value_removed = this.customQueue.getFirst();
        this.customQueue.removeFirst();
        return value_removed;
    }

    /**
     * Function that return the first element of queue.
     *
     * @return Node.
     */
    public Node peek() {
        return this.customQueue.getFirst();
    }

}
