package DGenericContainer;

import java.util.ArrayList;

/**
 * @author supremepole
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<String>();
        strings.add("string1");
        strings.add("string2");
        strings.remove(1);//删除第2个元素
        strings.get(0);//访问第1个元素
        strings.set(0,"string0");//第1个参数为索引位置，第2个参数为要修改的值
        strings.size();//计算大小
    }
}
