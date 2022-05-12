package DGenericContainer.List_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Traverse
 * @Description 遍历ArrayList
 * @Author CodeCoderCoding
 * @Date 2022/4/29 19:02
 * @Version 1.0.0
 **/
public class Traverse {
    public static void main(String[] args) {
        //forTraverse();
        //forEachTraverse();
        iteratorTraverse();
    }

    public static void forTraverse(){
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("https://cs.supremepole.com/");
        arrayList.add("https://algorithm.supremepole.com/");
        arrayList.add("https://interview.supremepole.com/");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }

    public static void forEachTraverse(){
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("https://cs.supremepole.com/");
        arrayList.add("https://algorithm.supremepole.com/");
        arrayList.add("https://interview.supremepole.com/");
        for(String string:arrayList){
            System.out.println(string);
        }
    }

    public static void iteratorTraverse(){
        ArrayList<String> arrayList=new ArrayList();
        arrayList.add("https://cs.supremepole.com/");
        arrayList.add("https://algorithm.supremepole.com/");
        arrayList.add("https://interview.supremepole.com/");
        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
