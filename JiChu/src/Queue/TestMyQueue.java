package Queue;

/**
 * @author wangyibo
 * @date 2021-12-20 23:46
 */
public class TestMyQueue {
    public static void main(String[] args) {
        //创建一个队列
        MyQueue mq = new MyQueue();
        mq.add(9);
        mq.add(8);
        mq.add(7);
        //出队
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        //判断是否为空
        System.out.println(mq.isEmpty());
    }
}
