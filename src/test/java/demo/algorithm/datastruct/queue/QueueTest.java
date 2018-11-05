package demo.algorithm.datastruct.queue;

import org.junit.Test;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class QueueTest {
    @Test
    public void arrayQueueTest(){
        ArrayQueue arrayQueue= new ArrayQueue(10);
        for (int i = 0; i < 10; i++) {
            arrayQueue.enqueue("item" + i);
        }

        arrayQueue.dequeue();
        arrayQueue.dequeue();

        arrayQueue.enqueue("item10");
        arrayQueue.enqueue("item11");

        String item = null;
        while ((item = arrayQueue.dequeue())!= null){
            System.out.println(item);
        }
    }

    @Test
    public void linkQueueTest() {
        LinkQueue linkQueue = new LinkQueue();
        for (int i = 0; i < 10; i++) {
            linkQueue.enqueue("item" + i);
        }

        System.out.println("linkQueue dequeue : " + linkQueue.dequeue());

        String item = null;
        while ((item = linkQueue.dequeue()) != null) {
            System.out.println(item);
        }

        linkQueue.enqueue("item10");
    }

    @Test
    public void circleQueueTest() {
        CircleQueue circleQueue = new CircleQueue(10);
        for (int i = 0; i < 11; i++) {
            System.out.println(("item" + i) + ">>>" + circleQueue.enqueue("item" + i));
        }

        String name = null;
        while ((name = circleQueue.dequeue()) != null) {
            System.out.println(name);
        }

//        for (int i = 0; i < 11; i++) {
//            System.out.println(circleQueue.enqueue("item" + i));
//        }
//
//        while ((name = circleQueue.dequeue()) != null) {
//            System.out.println(name);
//        }
    }
}
