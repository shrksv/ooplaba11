package com.example.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("afdk")
                                    .age(32)
                                    .gender("m")
                                    .grade(61)
                                    .grade(100) //From MatAnalis
                                    .grades(Arrays.asList(62, 63))
                                    .build();
        System.out.println(user);
    }
}