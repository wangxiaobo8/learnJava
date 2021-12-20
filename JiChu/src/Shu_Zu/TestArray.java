package Shu_Zu;



/**
 * @author wangyibo
 * @date 2021-12-20 21:53
 */
public class TestArray {
    public static void main(String[]args){
        /**
         *数组常用方法
         */
        //创建一个数组
        int [] arr1 = new int[3];
        //获取数组长度
        int length1 = arr1.length;
        System.out.println(length1);
        //访问数组元素：数组名[下标] 注意下标从零开始。最大为长度减一
        int element0 = arr1[0];
        System.out.println(element0);
        //为数组中的元素赋值
        arr1[0] = 99;
        System.out.println(arr1[0]);
        arr1[1] = 98;
        arr1[2] = 97;
        //遍历数组
        for(int i = 0 ;i<arr1.length;i++){
            System.out.println("arr1 element"+i+":"+arr1[i]);
        }
        //创建数组的同时为数组中的元素赋值
        int [] arr2 = new int[]{90,80,70,60,50};
        System.out.println("数组的长度："+arr2.length);
    }

}
