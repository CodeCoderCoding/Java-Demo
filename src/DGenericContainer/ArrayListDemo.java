package DGenericContainer;

import java.util.ArrayList;

/**
 * @author supremepole
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //test2();
        iteratorException();
    }
    /**
     * ArrayList的基本使用
     */
    public static void test1(){
        ArrayList<String> strings=new ArrayList<String>();
        strings.add("string1");
        strings.add("string2");
        strings.remove(1);//删除第2个元素
        strings.get(0);//访问第1个元素
        strings.set(0,"string0");//第1个参数为索引位置，第2个参数为要修改的值
        strings.size();//计算大小
    }

    /**
     * ArrayList创建二维使用
     */
    public static void test2(){
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

    /**
     * 迭代器异常问题
     */
    public static void iteratorException(){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
//        for(Integer i:arrayList){
//            if(i==2){
//                arrayList.remove(i);
//                //arrayList.add(2);
//                System.out.println(arrayList.size());
//            }
//            //arrayList.add(2);//ConcurrentModifiedException
//        }
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.size());
            arrayList.add(2);
            System.out.println(arrayList.size());
            arrayList.remove(3);
            System.out.println(arrayList.size());
        }
    }
}
