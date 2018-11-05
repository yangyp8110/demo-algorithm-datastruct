package demo.algorithm.datastruct.stack;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class ArrayStack {
    private String[] items;
    private int count;
    private int size;

    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.size = n;
    }

    public boolean push(String item) {
        if (this.count == this.size) {
            return false;
        }
        this.items[count++] = item;
        return true;
    }

    public String pop() {
        if (this.count == 0) {
            return null;
        }
        return this.items[--count];
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return size;
    }
}
