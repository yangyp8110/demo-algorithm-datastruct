package demo.algorithm.datastruct.stack;

import org.junit.Test;

/**
 * Created by mr.yang on 2018/11/4.
 */
public class StackTest {
    @Test
    public void testStack() {
        ArrayStack stack = new ArrayStack(10);
        for (int i = 0; i < 10; i++) {
            stack.push("hello" + i);
        }
        System.out.println(stack.push("dd"));

        String item = null;
        while ((item = stack.pop()) != null) {
            System.out.println(item);
        }
    }

    @Test
    public void testLinkStack(){
        LinkStack link = new LinkStack();
        System.out.println(link.push("first-node"));
        System.out.println(link.push("second-node"));
        System.out.println(link.push("third-node"));

        System.out.println(link.pop());
        System.out.println(link.pop());
        System.out.println(link.pop());
        System.out.println(link.pop());
    }
}
