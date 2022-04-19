package com.logos.Lesson_10.StringBufferExample;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Start");
        stringBuffer.append(" is not finish").append(", but good try.");
        System.out.println(stringBuffer);
        int length = stringBuffer.length();
        System.out.println("Length = " + length);
        int capacity = stringBuffer.capacity();
        System.out.println("Capacity = " + capacity);

        //StringBuffer reverse = stringBuffer.reverse();
        //System.out.println(reverse);
        stringBuffer.delete(30, 34);
        System.out.println(stringBuffer);
        StringBuffer insert = stringBuffer.insert(0, "A ");
        System.out.println(insert);
        StringBuffer have_a_nice_day = stringBuffer.replace(0, 5, "have a nice day");
        System.out.println(have_a_nice_day);
    }

}
