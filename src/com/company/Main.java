package com.company;

import java.util.*;

import static java.util.stream.Stream.of;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Optional<Object> maxNumber = Arrays.stream(of(random.nextInt(20), random.nextInt(20),
                        random.nextInt(20), random.nextInt(20), random.nextInt(20),
                        random.nextInt(20), random.nextInt(20), random.nextInt(20),
                        random.nextInt(20), random.nextInt(20)).filter(x -> x % 2 == 0)
                        .peek(x -> System.out.print(x * x + "  ")).toArray())
                .max(Comparator.comparingInt(Object::hashCode));
        int max = (int) maxNumber.get();
        System.out.println("\nMaximum values of even numbers is :" + max * max);
    }
}
//    Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.