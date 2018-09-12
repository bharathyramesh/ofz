package com.ofs.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonDuplicateElement {

    public static void main(String[] args) {

        List<Integer> randomNumbers = Arrays.asList(1, 6, 10, 1, 25, 78, 10, 25);
        List<Integer> list = randomNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }

}
