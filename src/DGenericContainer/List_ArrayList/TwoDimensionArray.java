package DGenericContainer.List_ArrayList;

import java.util.ArrayList;

/**
 * @ClassName TwoDimensionArray
 * @Description 使用ArrayList创建二维数组
 * @Author CodeCoderCoding
 * @Date 2022/4/29 19:01
 * @Version 1.0.0
 **/
public class TwoDimensionArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<Integer>();
        ArrayList<Integer> arrayList2=new ArrayList<Integer>();
        arrayList1.add(0);
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayLists.add(arrayList1);
        arrayList2.add(10);
        arrayList2.add(11);
        arrayLists.add(arrayList2);
        System.out.print(arrayLists);
    }
}
