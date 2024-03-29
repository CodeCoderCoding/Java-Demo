package DGenericContainer.Map_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author supremepole
 */
public class HashMapDemo {
    public static void main(String[] args) {
        basicUse();
        keySet();
        nullList();
    }

    public static void basicUse(){
        HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
        hashMap.put(1,"string1");
        hashMap.put(2,"string2");
        hashMap.get(1);//获取指定键key对应的值value
        hashMap.getOrDefault(1,"Not found!");//key的映射存在在hashmap中则返回对应的映射，否则返回默认值"Not found!"
        hashMap.size();//计算大小
        hashMap.remove(1);//删除key对应的键值对
        hashMap.clear();//删除所有的键值对
        hashMap.entrySet();//返回hashMap中所有映射项的集合视图
        hashMap.keySet();//返回hashMap中所有key组成的集合视图
    }

    public static void keySet(){
        Map<String, String> map=new HashMap<>();
        map.put("key1", "value1");
        System.out.println(map.keySet());
        map.keySet().forEach(k->{
            System.out.println(k);
        });
    }

    public static void nullList(){
        List<String> list=new ArrayList<>();
        String string=null;
        list.add(string);
        System.out.println(list.size());
    }

}
