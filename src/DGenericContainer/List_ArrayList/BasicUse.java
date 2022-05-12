package DGenericContainer.List_ArrayList;

import java.util.ArrayList;

/**
 * @ClassName BasicUse
 * @Description 基础使用
 * @Author CodeCoderCoding
 * @Date 2022/4/29 18:58
 * @Version 1.0.0
 **/
public class BasicUse {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("https://cs.supremepole.com/");
        arrayList.add("https://algorithm.supremepole.com/");
        arrayList.add("https://interview.supremepole.com/");
        arrayList.remove(1);//删除第2个元素
        arrayList.get(0);//访问第1个元素
        arrayList.set(0,"string0");//第1个参数为索引位置，第2个参数为要修改的值
        arrayList.size();//计算大小
    }
}
