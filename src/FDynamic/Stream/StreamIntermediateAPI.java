package FDynamic.Stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateAPI {

    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("bbb", 19, new BigDecimal(124))
        );
        filter(personList);
        distinct(personList);
        map(personList);
    }

    //过滤出符合条件，person的age>18的人
    public static void filter(List<Person> personList){
        List<Person> list=personList.stream()
                .filter(person->person.getAge()>18)
                .collect(Collectors.toList());
        printList("filter:", list);
    }

    //过滤不同的人
    public static void distinct(List<Person> personList){
        List<Person> list=personList.stream()
                .distinct()
                .collect(Collectors.toList());
        printList("distinct:", list);
    }

    // 使用map，将List<Person>转换为person的名字List<String>
    public static void map(List<Person> personList){
        List<String> list=personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("map: "+list);
    }

    // 打印personList中的内容
    public static void printList(String flag, List<Person> personList){
        System.out.println(flag);
        for(Person person:personList){
            System.out.println(person);
        }
        System.out.println();
    }

}
