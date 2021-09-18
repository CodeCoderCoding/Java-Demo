package DGenericContainer;

import java.util.HashSet;

/**
 * @author supremepole
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<String>();
        strings.add("string1");
        strings.add("string2");
        strings.add("string1");  // 重复的元素不会被添加
        strings.size(); //计算hashset的大小
        strings.contains("string1");  //判断指定的元素是否存在，返回true或false
        strings.remove("strings1"); // 删除元素，删除成功返回 true，否则为 false
        strings.clear();  //清除所有的元素
    }
}
