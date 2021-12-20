package Queue;

/**
 * @author wangyibo
 * @date 2021-12-20 23:40
 * 数组实现队列
 */
public class MyQueue {
    int [] elements;

    public MyQueue(){
        elements = new int[0];
    }
    //人队
    public void add(int element){
        int [] newArr = new int[elements.length+1];
        //把原数组的元素复制到新的数组中
        for(int i = 0;i<elements.length;i++){
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        //使用新数组替换旧数组
        elements = newArr;
    }
    //出队
    public int poll(){
        //把数组中的第0个元素取出来
        int element = elements[0];
        //创建一个新数组
        int [] newArr = new int[elements.length-1];
        //复制原数组的元素到新数组中
        for (int i = 0; i<newArr.length;i++){
            newArr[i] = elements[i+1];
        }
        //替换数组
        elements = newArr;
        return element;
    }
        //判断队列是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }
}
