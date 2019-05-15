package homework1;

public interface IList<T>  {

    void add(int index, T value);

    void addFirst(T value);

    void addLast(T value);

    void remove(int index);

    void removeFirst();

    void removeLast();

    void printList();

    Node getIndex(int index);

}
