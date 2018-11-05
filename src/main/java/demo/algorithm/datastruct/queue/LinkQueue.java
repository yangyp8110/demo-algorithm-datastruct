package demo.algorithm.datastruct.queue;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class LinkQueue {
    private Node head;
    private Node tail;

    public LinkQueue() { }

    /**
     * 入队列
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        Node node = new Node(item);
        //队列为空
        if(this.tail == null) {
            this.tail = node;
            this.head = node;
            return true;
        }
        this.tail.next = node;
        this.tail = node;
        return true;
    }

    /**
     * 出队列
     * @return
     */
    public String dequeue() {
        //队列为空
        if (this.head == null) {
            return null;
        }
        String name = this.head.getName();
        this.head = this.head.next;
        if (this.head == null) {
            this.tail = null;
        }
        return name;
    }

    private static class Node {
        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
