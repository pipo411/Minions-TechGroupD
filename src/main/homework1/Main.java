package homework1;

public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList();
        customList.addFirst(1);
        customList.addLast(2);
        customList.addLast(3);
        customList.addLast(4);
        customList.addLast(5);
        customList.addLast(6);
        customList.add(0, 89);
        customList.printList();

        System.out.println("******************************");
        customList.remove(4);
        customList.printList();

    }
}
