package FDynamic.Stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTerminalAPI {

    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("bbb", 19, new BigDecimal(124))
        );
        max(personList);
    }

    public static void max(List<Person> personList){
        Person person=personList.stream()
                .max(Comparator.comparing(Person::getAge))
                .get();
        System.out.println(person);
    }

}
