package com.prodigious.java.training;

import com.prodigious.groovy.training.GTest;

import java.util.function.Function;

public class JTest {
    public static void main(String[] args) {
        GTest gTest = new GTest();
        gTest.setName("nombre");
        gTest.setType("test");
        System.out.println(gTest);
        Function<Integer,Boolean> isEven = x -> x%2==0;
        System.out.println("done");
    }
}
