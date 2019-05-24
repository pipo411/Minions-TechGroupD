package homework1;

/**
 * IList interface class.
 */
public interface IList<T> {

    /**
     * Function that involve add node
     * by index into the list.
     *
     * @param index int  index.
     * @param value T    value.
     */
    void add(int index, T value);

    /**
     * Function that involve add node
     * at the head into the list.
     *
     * @param value T    value.
     */
    void addFirst(T value);

    /**
     * Function that involve add node
     * at the tail into the list.
     *
     * @param value T    value.
     */
    void addLast(T value);

    /**
     * Function that involve remove node
     * by index into the list.
     *
     * @param index int  index.
     */
    void remove(int index);

    /**
     * Function that involve remove head node
     * on the list.
     */
    void removeFirst();

    /**
     * Function that involve remove tail node
     * on the list.
     */
    void removeLast();

    /**
     * Function that show the list
     * elements.
     */
    void printList();


    /**
     * Function that return specific node
     * into the list.
     *
     * @param index int  index.
     * @return node value
     */
    Node getIndex(int index);

    Node getFirst();

    Node getLast();
}
