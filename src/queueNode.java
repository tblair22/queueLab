/*
Trent Blair
12/1/21
This program implements queue and uses node
 */
public class queueNode <T>{

    node<T> first;
    node<T> last;
    int size;

    public queueNode() {
        size = 0;
    }

    void enqueue(T element){
        node<T> node = new node<>(element);
        if(size == 0) first = node;
        else last.setNext(node);
        last = node;
        size++;
    }

    T dequeue(){
        T returnVal = first.getData();
        first = first.getNext();
        size = Math.max(0, size-1);
        return returnVal;
    }

    boolean isEmpty(){
        return size == 0;
    }

    int size(){
        return size;
    }

    T peek(){
        return first.getData();
    }

}
