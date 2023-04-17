package com.example.learning.tacocloud.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetTest {

    // arr [] = {1, 2, 3, -4, -5, 7}
    //{1, -4, 3, 2, -5, 7}

    //{0,0,0,1,0,1,0}
    //{1,0,0,1,0,0,0}
    //{1,1,0,0,0,0,0}
    //{1,1,0,0,0,0,0}




    public static void main(String ... args) {
//        int [] array = {0,0,0,1,0,1,0};
//        Arrays.stream(arrange(array, array.length)).forEach(System.out::println);
        System.out.println(reverse("Amartya"));
    }

    public static int[] arrange(int [] nums, int n) {
       int first = 0;
       int last = n-1;
       while(last > first) {
           if(nums[first] > 0) {
               first++;
           }
           if(nums[last] == 0) {
               last--;
           }
           if(nums[last] > 0 && nums[first] == 0) {
               swap(nums, first, last);
           }
       }
       return nums;
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static String reverse(String str) {
        String nStr = "";
        char ch;
        for(int i = str.length() -1 ; i >= 0; i--) {
            ch = str.charAt(i);
            nStr += ch;
        }
        return nStr;
    }
}
