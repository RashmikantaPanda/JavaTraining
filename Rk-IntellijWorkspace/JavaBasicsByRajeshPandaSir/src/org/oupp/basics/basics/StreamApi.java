package org.oupp.basics.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main1(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java");
        stream.filter(s -> s.contains("o")).map(String::toUpperCase).forEach(x -> System.out.print(x + " "));
    }

    public static void main2(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry");

        list.stream().sorted((s1, s2) ->s1.compareTo(s2)).forEach(System.out::println);

    }

    public static void main3(String[] args) {
        List<Integer>
                list = Arrays.asList(1, 15, 3, 10, 27);
        int sum = list.stream()
                .filter(i -> i % 3 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
