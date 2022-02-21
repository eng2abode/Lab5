/**
 * Created by HP on 21/02/2022.
 */
public class SinlyLinkedList<E> {
    private Node<E>head=null;
    private Node<E>tail=null;
    private int size=0;

    public SinlyLinkedList() {
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
       return size;
    }

    public E first(){
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addfirst(E el){
        head=new Node<E>(el,head);
        if (isEmpty())
            tail=head;
        size++;
    }

    public void addlast(E el){
        Node<E>newset=new Node<E>(el,null);
        if (isEmpty())
            head=newset;
        else
            tail.setNext(newset);
        tail=newset;
        size++;
    }

    public E removeFirst(){
        if (isEmpty())return null;
        E del=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return del;
    }

    private static class Node<E>{
        E element;
        Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
