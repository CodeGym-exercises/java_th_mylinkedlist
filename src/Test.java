public class Test {
    public static void main(String[] args) {
        Mylinkedlist<Integer> list = new Mylinkedlist<Integer>();

        list.addLast(66);
        list.addFirst(3);
        list.addFirst(5);
        list.addLast(66);
        list.printList();
        list.insert(3,90);
        list.printList();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
