package demo.algorithm.datastruct.queue;

/**
 * Created by mr.yang on 2018/11/4.
 *
 * 数组实现的循环队列
 */
public class CircleQueue {
    private String[] items;
    private int capacity;
    private int head = 0;
    private int tail = 0;

    public CircleQueue(int n) {
        this.items = new String[n];
        this.capacity = n;
    }

    /**
     * 入队列（从队列尾部入）
     * @param item
     * @return
     */
    public boolean enqueue(String item) {
        //队列满了
        if (this.head == (this.tail + 1)% this.capacity) {
            return false;
        }
        items[tail] = item;
        tail = (tail + 1) % this.capacity;
        return true;
    }

    /**
     * 出队列（从队列头部出）
     * @return
     */
    public String dequeue() {
        //队列为空
        if (this.head == this.tail) {
            return null;
        }
        String item = this.items[head];
        head = (head + 1) % this.capacity;
        return item;
    }
}
