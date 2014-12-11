package com.example;

import java.util.stream.Stream;
import java.util.Objects;

public class Main {

    private static final int    OK_VALUE = 10;
    private static final int CRASH_VALUE = 11;

    public static void main(String[] args) throws InterruptedException {
        for(int iteration = 0; iteration < Integer.MAX_VALUE; iteration++) {

            for(int i = 0; i < CRASH_VALUE; i ++) {
                Stream.empty().
                        filter(Objects::isNull).
                        forEach(node -> {});
            }

            Stream.empty().filter(Objects::isNull).count();

            System.out.println(iteration);
            Thread.sleep(10);
        }
    }
}
