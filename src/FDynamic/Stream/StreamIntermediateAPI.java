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
    }

    public static void filter(List<Person> personList){
        List<Person> list=personList.stream()
                .filter(person->person.getAge()>18)
                .collect(Collectors.toList());
        printList("filter:", list);
    }

    public static void distinct(List<Person> personList){
        List<Person> list=personList.stream()
                .distinct()
                .collect(Collectors.toList());
        printList("distinct:", list);
    }

    public static void printList(String flag, List<Person> personList){
        System.out.println(flag);
        for(Person person:personList){
            System.out.println(person);
        }
    }

}
