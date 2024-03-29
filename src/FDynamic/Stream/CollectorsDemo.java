package FDynamic.Stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("bbb", 19, new BigDecimal(124))
        );
        groupBy(personList);
        partionBy(personList);
    }

    /**
     * 根据人员的name来进行分组
     * @param personList
     */
    public static void groupBy(List<Person> personList){
        Map<String, List<Person>> map=personList.stream()
                .collect(Collectors.groupingBy(Person::getName));
        System.out.println(map);
    }

    /**
     * 根据人员的name是否是aaa来进行区分
     * @param personList
     */
    public static void partionBy(List<Person> personList){
        Map<Boolean, List<Person>> map=personList.stream()
                .collect(Collectors.partitioningBy(person -> "aaa".equals(person.getName())));
        System.out.println(map);
    }

}
