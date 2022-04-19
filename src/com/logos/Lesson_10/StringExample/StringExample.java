package com.logos.Lesson_10.StringExample;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {
        String stringExample = "test string";
        int length = stringExample.length();
        System.out.println("string length = " + length);
        String stringExample2 = "test string";
        System.out.println("compare use == " + (stringExample == stringExample2));
        System.out.println("format string = " + String.format("Integer : %d", 235));
        String formatFloating = String.format("Float formal : %.3f", 23.6748);
        System.out.println("format string = " + formatFloating);
        char[] charArray = stringExample.toCharArray();
        System.out.println(Arrays.toString(charArray));

        String url = "/product/details/amount=2";
        String[] split = url.split("/");
        String lastElement = split[split.length - 1];
        System.out.println("Last Element = " + lastElement);
        String[] split1 = lastElement.split("=");
        String s = split1[1];
        System.out.println(s);

        System.out.println(Arrays.toString(split));
        String amount = split[1];
        System.out.println("split = " + split);
        String trimer = "    test some string    ";
        String trim = trimer.trim();
        System.out.println("trim = " + trim);



    }

}
