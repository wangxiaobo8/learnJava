package Shu_Zu;

import java.util.Arrays;

/**
 * @author wangyibo
 * @date 2021-12-20 22:05
 */
public class TestOpArray {
    public static void main(String[] args) {
        //解决数组的长度不可变
        int [] arr = new int[]{9,8,7};
        //快速查看数组中的元素
        System.out.println(Arrays.toString(arr));
        //要加入数组的目标元素
        int dst = 6;

        //新建一个数组,长度时原数组+1
        int [] newArr = new int[arr.length+1];
        //把原数组中的数据全部复制到新数组中
        for(int i = 0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        //把目标元素放在新数组的最后
        newArr[arr.length] = dst;
        System.out.println(Arrays.toString(newArr));
        //新数组替换原数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));



    }
}
