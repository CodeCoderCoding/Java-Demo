package DGenericContainer.Map_HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapHashMap
 * @Description
 * @Date 2022/9/20 11:39
 * @Version 1.0.0
 **/
public class MapHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap=new HashMap<>();
        //错误示例：Collections.emptyMap()的返回类型为Map
        //HashMap<String, String> hashMap1=Collections.emptyMap();
        useHashMap(hashMap);
        Map<String, String> map=new HashMap<>();
        //错误示例：方法参数为hashMap类型
        //useHashMap(map);
        Map<String, String> map1= Collections.emptyMap();
        //错误示例：方法参数为hashMap类型
        //useHashMap(map1);
    }

    public static void useHashMap(HashMap<String, String> hashMap){

    }
}
