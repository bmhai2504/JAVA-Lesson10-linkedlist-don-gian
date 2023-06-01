public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);

        linkedList.add(3, 15);
        linkedList.add(4, 17);

        linkedList.printList();
    }
}