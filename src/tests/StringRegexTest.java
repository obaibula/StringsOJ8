package tests;

import java.util.Arrays;

public class StringRegexTest {
    public static void main(String[] args) {
        String text = "Cindarella and Sleeping Beauty... sat in a tree";
        System.out.println(text.matches(".*and.*"));
        System.out.println(Arrays.toString(text.split("\\W+")));
        System.out.println(text.replaceAll("(?i)[aouei]", "_"));
    }
}
