package Stack;

/**
 * @author wangyibo
 * @date 2021-12-20 23:27
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(9);
        ms.push(8);
        ms.push(7);
        //取出栈顶元素
//        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        System.out.println(ms.isEmpty());
    }
}
