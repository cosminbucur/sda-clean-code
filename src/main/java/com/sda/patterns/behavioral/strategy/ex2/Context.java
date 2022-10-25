package com.sda.patterns.behavioral.strategy.ex2;

import com.sda.patterns.behavioral.strategy.ex1.SearchStrategy;
import com.sda.patterns.behavioral.strategy.ex1.SortStrategy;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Context {

    private Consumer<List<String>> sortStrategy;
    private Function<List<String>, String> searchStrategy;

    void sort(List<String> list) {
        sortStrategy.accept(list);
    }

    public Context(Consumer<List<String>> sortStrategy, Function<List<String>, String> searchStrategy) {
        this.sortStrategy = sortStrategy;
        this.searchStrategy = searchStrategy;
    }

    public void setSortStrategy(Consumer<List<String>> sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void setSearchStrategy(Function<List<String>, String> searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public String search(List<String> list) {
        return searchStrategy.apply(list);
    }
}