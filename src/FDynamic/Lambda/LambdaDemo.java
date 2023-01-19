package FDynamic.Lambda;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] stringArray=new String[] {"C", "BB", "A", "DD"};
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("根据字典排序"+Arrays.toString(stringArray));
        Arrays.sort(stringArray, new LengthComparator());
        System.out.println("根据长度排序的结果(LengthComparator)："+Arrays.toString(stringArray));
        Arrays.sort(stringArray, (first,second) -> first.length()-second.length());
        System.out.println("根据长度排序的结果(Lambda)："+Arrays.toString(stringArray));
    }
}
