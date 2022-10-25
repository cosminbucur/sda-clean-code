package com.sda.patterns.behavioral.strategy.ex2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Client {

    public static void main(String[] args) {
        List<String> list = List.of("b", "a", "c");
        Consumer<List<String>> bubbleSort = bubbleList -> System.out.println("List sorted using Bubble sort implementation");
        Function<List<String>, String> binarySearch = binaryList -> {
            System.out.println("list is binary searched");
            return null;
        };
        Context context = new Context(bubbleSort, binarySearch);

        context.sort(list);
        context.search(list);

        System.out.println("---");

        Consumer<List<String>> quickSort = quickList -> System.out.println("List sorted using Quick sort implementation");
        Function<List<String>, String> linearSearch = linearList -> {
            System.out.println("list is linearly searched");
            return null;
        };
        context.setSortStrategy(quickSort);
        context.setSearchStrategy(linearSearch);
        context.sort(list);
        context.search(list);
    }
}
