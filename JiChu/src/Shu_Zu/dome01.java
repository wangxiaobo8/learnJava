package Shu_Zu;
import java.util.Arrays; // Arrays.toString()显示数组元素 Arrays.sort()排序

/**
 * @author wangyibo
 * @date 2021-12-17 22:52
 */
public class dome01 {
    public static void main(String[] args){
        /**
         * 数组是引用型数据类型。
        定义数组
        语法格式一: 数据类型 [] 数组名称  = new 数据类型[10]; 数组定义后 必须初始化 new int[10]
               二：数据类型 [] 数值名称 = new 数据类型[]{,,,,};可以直接对数组初始化，不必写出数组大小。

         * 数组的特点：
         * 数组所有元素初始化为默认值，整型为 0, 浮点型为 0.0，布尔型为false。
         * 数组一旦创建后，大小就不可改变。
         * 数组索引从 0 开始 例如，5个元素的数组，索引范围是 0~4.
         * 可用 数组名.length获取数组大小.
         * 可用for循环遍历数组
         */
        int [] sz ;//定义数组
        //给数组赋值
        sz = new int[]{ 2,3,23,34,56,67,7,6,88};
        System.out.println("sz的数组大小为："+sz.length);
        /**
         * for each 循环遍历数组 不用考虑数组下标越界
         */
        for(int n : sz){
            System.out.println(n);
        }

        //  for循环 遍历数组
        for(int i = 0;i < sz.length;i++){
                int n = sz[i] ;
            System.out.println(n);
        }
        //使用toString()方法遍历数组
        System.out.println(Arrays.toString(sz));

        /**
         * Arrays.sort()方法排序
         * 数组排序实际上是修改了数组本身,其内容不变 索引变了
         */
        Arrays.sort(sz);
        System.out.println(Arrays.toString(sz));
    }
}

