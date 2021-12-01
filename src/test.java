/*
Trent Blair
12/1/21
This tests the queue lab and says what should come out
 */
public class test {
    public static void main(String[] args) {
        queueNode<Integer> i = new queueNode<>();

        i.enqueue(4);
        i.enqueue(8);

        System.out.println(i.size());//should print 2
        System.out.println(i.isEmpty());//should print false
        System.out.println(i.dequeue());//should print 4

        System.out.println(i.peek());//should print 8
        System.out.println(i.size());//should print 1

        System.out.println(i.dequeue());//should print 8
        System.out.println(i.isEmpty());//should print true

    }
}
