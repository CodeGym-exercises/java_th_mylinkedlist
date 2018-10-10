public class Mylinkedlist<T> {
    private Node<T> head;
    private Node<T> tail;

    public Mylinkedlist(){
        this.head = null;
        this.tail = null;
    }

    public void addFirst(T data){
        Node<T> pointer = this.head;
        this.head = new Node<T>(data);
        this.head.next = pointer;
    }

    public void addLast(T data){
        Node<T> pointer = this.head;

        if(this.head==null){
            this.head = this.tail = new Node<T>(data);
        }else{
            while(pointer.next!=null){
                pointer=pointer.next;
            }
            this.tail = pointer;
            tail.next=new Node<T>(data);
            this.tail = this.tail.next;
        }
    }

    public void insert(int index, T data){
        Node<T> node = new Node<T>(data);
        Node<T> pointer = this.head;

        if(index==0){
            this.addFirst(data);
        }else{
            for(int i = 0; i < index-1; i++){
                pointer = pointer.next;
            }
            node.next = pointer.next;
            pointer.next = node;
        }

    }

    public T get(int index){
        Node<T> pointer = this.head;
        for(int i = 0; i < index; i++){
            pointer=pointer.next;
        }
        return pointer.data;
    }

    public void printList(){
        Node<T> pointer = this.head;
        if(this.head==this.tail){
            System.out.println(this.head.data+ " ");
        }
        while(pointer!=null){
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println("");
    }

    private class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
        }
    }
}
