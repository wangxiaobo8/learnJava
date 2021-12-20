package Shu_Zu;

/**
 * @author wangyibo
 * @date 2021-12-20 22:42
 */
public class TestMyArray {
    public static void main(String[] args) {
        //创建一个可变数组
        MyArray ma = new MyArray();
        //获取长度
        int size = ma.size();
        ma.show();
        System.out.println(size);
        //往可变数组中添加一个元素
        ma.add(99);
        ma.add(98);
        ma.add(97);
        //显示可变数组到控制台
        ma.show();
        //删除某个元素
        ma.delete(1);
        ma.show();
        //取出指定位置的元素
        int element = ma.get(1);
        System.out.println(element);
        //插入一个元素
        System.out.println("=================");
        ma.add(96);
        ma.add(95);
        ma.add(94);
        ma.show();
        ma.insert(3,3);
        ma.show();
        //替换指定位置的元素
        System.out.println("====================");
        ma.set(0,100);
        ma.show();

    }
}
