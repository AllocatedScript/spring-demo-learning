package com.example.learning.tacocloud.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    public static void main(String[] args) {
//        final List<String> stringList = new ArrayList<>();
//        stringList.add("amartya");
//        stringList.add("mohit");
//        stringList.add("malobika");
//        stringList.add("malobika");
//        stringList.add("malobika");
//        stringList.add("malobika");
//
//        stringList.stream().forEach(System.out::println);
//        final List<String> listWithoutDups = stringList.stream().distinct().collect(Collectors.toList());
//        System.out.println(listWithoutDups);
        System.out.println(isPalindrome("a"));
    }

    public static boolean isPalindrome(final String demoString) {
        //copy into array
        final char [] copy = demoString.toCharArray();
        for(int i =copy.length -1; i >= copy.length /2 ; i--) {
            if(copy[i] != demoString.charAt(copy.length - i -1)) {
                return false;
            }
        }
        return true;
    }
}
