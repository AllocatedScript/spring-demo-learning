package com.example.learning.tacocloud.example;

import java.util.Stack;

public class JPMCTest1 {
    //assertEquals(exp1, exp2);
    //op : assertThat(exp2, is(exp1));

    //assertEquals(Arrays.asList("a", "b"), Arrays.asList("C", "D"));
    //op assertThat(Arrays.asList("C", "D"), is(Arrays.asList("a", "b")));

//    public String assertionConverter(final String exp) { //
        //read the expression and copy into char array
        // find first index of "("
        //
        //


       // stack -> push elements one by one,
        // pop elements
//        if(stack.isEMpty() && nextSYmbol == ",")
//    }

    public static String assertionConverter2(final String exp) { //

        //while next symbol is not "(", keep going
        //keep going till we find a "(" or ","
        //if we find a "(" push to stack and keep going
        // if we find a "," stop and read expression scanned so far
        //pop stack once we

        Stack<String> opStack = new Stack<>();
        String exp1 = "";
        String exp2;
        int firstIndex = 0;
        String assertThat;
        char nextSymbol = 0;
        int middleIndex = 0;
        char [] charArray = exp.toCharArray();
        for(int i = 0; i < charArray.length -1;) {
            nextSymbol = charArray[i];
            while(nextSymbol != '(') {
                if(i < charArray.length -1) {
                    nextSymbol = charArray[i++];
                }
                if(nextSymbol == '(') {
                    firstIndex = i;
                    break;
                }
            }
            while(nextSymbol != ')') {
                nextSymbol = charArray[++i];
                if(nextSymbol == '(') {
                    opStack.push("(");
                    i++;
                }
                if(nextSymbol == ')') {
                    if(!opStack.isEmpty())
                    {
                    opStack.pop();
                    i++;
                    }
                }
            }
            if(opStack.isEmpty() && nextSymbol == ',') {
                middleIndex = i;
                break;
            }
        }
        exp1 = exp.substring(firstIndex, middleIndex-1);
        exp2 = exp.substring(middleIndex, exp.length()-2);
        assertThat = "assertThat(" + exp1 + ", is(" + exp2 + ");";

        return assertThat;
    }

    public static void main (String... args) {
        System.out.println(assertionConverter2("assertEquals(Arrays.asList(\"a\", \"b\"), Arrays.asList(\"C\", \"D\"));"));
    }

}
