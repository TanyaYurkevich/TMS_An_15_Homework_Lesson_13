package com.teachmeskills.Lesson_13.Task2;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Andrew Reut");
        list.add("Dovlet Atakishiev");
        list.add("Andrey Troan");
        list.add("Hleb Yurchuk");
        list.add("aleksander Grouzdev");
        list.add("Aleksei Gorbal");
        list.add("Vladimir Bashlikov");
        list.add("Vladislav Losik");
        list.add("Dmitry Kripan");
        list.add("Roman Belov");
        list.add("Tatyana Yurkevich");

        System.out.println(list.stream().filter(n->n.toLowerCase().startsWith("a")).toList());
        System.out.println(list.stream().sorted().toList());
        System.out.println(list.stream().sorted().toList().subList(0,1));
    }
}
