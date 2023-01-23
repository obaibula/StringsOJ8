package tests;

import java.util.regex.Pattern;

public class PatterTest {
    public static void main(String[] args) {
        String text = "Hi/";
        String regex = "Hi\\W";
        boolean mathces = Pattern.matches(regex, text);

        System.out.println(mathces);
    }
}
