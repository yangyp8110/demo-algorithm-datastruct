package demo.algorithm.datastruct.queue;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class ArrayQueue {
    private String[] items;
    private int capacity;
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(int n) {
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
        if (this.tail == this.capacity) {
            //对列头部不在起始位置
            if (this.head == 0) {
                return false;
            }
            //搬移数据
            for (int i = head; i < tail; i++) {
                items[i - head] = items[i];
            }
            this.tail = tail - head;
            this.head = 0;
        }
        items[tail++] = item;
        return true;
    }

    /**
     * 出队列（从队列头部出）
     * @return
     */
    public String dequeue() {
        if (this.head == this.tail) {
            return null;
        }

        return this.items[head++];
    }
}
