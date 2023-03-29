package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(45,95,23,1,11,45,67,92,1,11);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        Set<Integer>collect2 = list.stream().collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println(collect2);
    }
}
