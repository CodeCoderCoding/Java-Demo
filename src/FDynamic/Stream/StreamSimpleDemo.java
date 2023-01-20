package FDynamic.Stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class StreamSimpleDemo {
    public static void main(String[] args) {
        List<Person> personList= Arrays.asList(
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("aaa", 18, new BigDecimal(123)),
                new Person("bbb", 19, new BigDecimal(124))
        );
        BigDecimal sum=personList.stream()
                .map(Person::getSalary)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        System.out.println(sum);
    }
}
