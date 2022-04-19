package com.logos.Lesson_11.pattern;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher("2");
        boolean isMatch = matcher.matches();
        System.out.println(isMatch);

        boolean isOtherMatch = Pattern.compile("[0-9]").matcher("4").matches();
        System.out.println(isOtherMatch);

        boolean isMatchAgain = Pattern.matches("[0-9]", "6");
        System.out.println(isMatchAgain);
        Matcher matcher2 = pattern.matcher("2234");
        System.out.println("Match " + matcher2.matches());
        System.out.println("Find " + matcher2.find());
        System.out.println("Index start " + matcher2.start());
        System.out.println("Index end " + matcher2.end());

        String url = "product/details?id=1234";
        String[] split = url.split(".?id=");
        System.out.println(Arrays.toString(split));
        System.out.println("our parameter " + split[1]);
    }
}
