/*
Trent Blair
12/1/21
This is a copy of the node class to use for queue
 */

public class node <T>{

    private T data;
    private node <T> next;

    public node(T data) {
        this.data = data;
    }

    public node(T data, node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }
}
