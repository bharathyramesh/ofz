package com.ofs.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindNumber {

    public static void main(String[] args) {

        List<Integer> randomNumbers = Arrays.asList(1, 6, 10, 25, 78);

        Stream<Integer> stream = randomNumbers.stream();

        Integer max = stream.max(Comparator.naturalOrder()).get();
        System.out.println(max);

        Integer min = stream.min(Comparator.naturalOrder()).get();
        System.out.println(min);

        Integer integerSum = stream.mapToInt(Integer::intValue).sum();
        System.out.println(integerSum);
    }
}
