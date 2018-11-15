package demo.algorithm.datastruct.queue;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class CircleLinkQueue {
    private Node head = null;
    private Node tail = null;

    public CircleLinkQueue(int n) {
        Node tempNode = null;
        // 初始化一个 n 大小的环形链表
        while (n >= 0) {
            Node node = new Node(String.valueOf(n));
            if (this.head == null) {
                this.head = this.tail = node;
                this.head.next = this.head;
                tempNode = this.head;
            } else {
                tempNode.next = node;
                tempNode = tempNode.next;
                tempNode.next = this.head;
            }
            n--;
        }
    }

    /**
     * 入队列（从队列尾部入）
     *
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        //队列满了
        if (this.head == this.tail.next) {
            //this.head = this.head.next; //当循环队列满了，head后移，tail覆盖原来的head位置
            //return true;
            return false;
        }
        this.tail.setValue(item);
        this.tail = this.tail.next;
        return true;
    }

    /**
     * 出队列（从队列头部出）
     *
     * @return
     */
    public String dequeue() {
        //队列为空
        if (this.head == this.tail) {
            return null;
        }
        String item = this.head.getValue();
        this.head = this.head.next;
        return item;
    }

    public Node peek() {
        //空队列
        if (this.head == this.tail) {
            return null;
        }
        return this.head;
    }

    private class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }
}
