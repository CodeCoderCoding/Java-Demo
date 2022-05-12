package DGenericContainer.List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName RemoveItem
 * @Description 移除ArrayList中的元素
 * @Author yuzhihua
 * @Date 2022/4/29 19:30
 * @Version 1.0.0
 **/
public class RemoveItem {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("https://cs.supremepole.com/");
        arrayList.add("https://algorithm.supremepole.com/");
        arrayList.add("https://interview.supremepole.com/");
        arrayList.add("target");
        removeWithFor(arrayList, "target");
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
     * 正确,倒序循环，因为list删除只会导致当前元素之后的元素位置发生改变，所以采用倒序可以保证前面的元素没有变化
     */
    public static void removeWithReverseFor(List<String> list, String target){
        for(int i = list.size() - 1; i >= 0; i--){
            String item = list.get(i);
            if(target.equals(item)){
                list.remove(item);
            }
        }
    }
    /*
     * 错误
     */
    public static void removeWithForEach(List<String> list, String target){
        for(String item : list){
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
                cowList.remove(item);
            }
        }
    }

    /*
     * 错误
     */
    public static void removeWithIteratorListRemove(List<String> list, String target){
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            String item = iter.next();
            if (item.equals(target)) {
                list.remove(item);
            }
        }
    }
    /*
     * 正确
     */
    public static void removeWithIteratorRemote(List<String> list, String target){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals(target)) {
                iterator.remove();
            }
        }
    }

}
