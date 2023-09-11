package com.teachmeskills.Lesson_13.Task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> list = randomList(20);

        System.out.println(list);
        System.out.println(list.subList(7,17).stream().distinct().filter(n->n%2==0).toList());
        // если под диапазоном (от 7 до 17) подразумевались индексы

        System.out.println(list.stream().distinct().filter(n->n%2==0&&n>=7&&n<=17).toList());
        // если под диапазоном (от 7 до 17) подразумевались значения

        System.out.println(list.stream().map(n->n*2).collect(Collectors.toList()));
        System.out.println(list.stream().sorted().toList().subList(0,4));
        System.out.println(list.stream().sorted().limit(4).toList());
        System.out.println(list.stream().count());
        System.out.println(list.stream().collect(Collectors.averagingInt(Integer::intValue)));
    }
    private static ArrayList<Integer>randomList(int size){
        return (ArrayList<Integer>) new Random()
                .ints(0,100)
                .limit(size)
                .boxed()
                .collect(Collectors.toList());
    }
}
