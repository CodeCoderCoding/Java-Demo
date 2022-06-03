package DGenericContainer.List_CopyOnWriteList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName CopyOnWriteListDemo
 * @Description
 * @Date 2022/5/12 22:07
 * @Version 1.0.0
 **/
public class CopyOnWriteListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("target");
        arrayList.add("https://cs.supremepole.com/");
        arrayList.add("https://algorithm.supremepole.com/");
        arrayList.add("https://interview.supremepole.com/");
        removeWithFor(arrayList, "target");
        //removeWithCopyOnWrite(arrayList, "target");
        print(arrayList);
    }

    /*
     * 错误
     */
    public static void removeWithFor(List<String> list, String target){
        for(int i = 0; i < list.size(); i++){
            String item = list.get(i);
            if(target.equals(item)){
                list.remove(item);
            }
        }
    }

    /*
     * 正确,拷贝一份只读副本，然后遍历的时候遍历副本，删除的时候删除原来的list。
     */
    public static void removeWithCopyOnWrite(ArrayList<String> list, String target) {
        final CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<String>(list);
        for(String item : cowList) {
            if (item.equals(target)) {
                list.remove(item);
            }
        }
    }

    public static void print(ArrayList<String> arrayList){
        for(String string:arrayList){
            System.out.println(string);
        }
    }
}
