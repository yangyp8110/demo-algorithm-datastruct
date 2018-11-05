package demo.algorithm.datastruct.stack;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class LinkStack {
    private Node top;

    public boolean push(String item) {
        Node node = new Node(item);
        if(top == null){
            top = node;
            return true;
        }
        node.next = top;
        top = node;
        return true;
    }

    public String pop() {
        if (top == null) {
            return null;
        }
        String name = top.getName();
        top = top.next;
        return name;
    }

    private static class Node {
        private String name;
        private Node next;

        public Node(String name) {
            this.name = name;
            this.next = null;
        }

        public String getName() {
            return name;
        }
    }
}
