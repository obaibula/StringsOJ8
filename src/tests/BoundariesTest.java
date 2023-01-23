package tests;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoundariesTest {
    public static void main(String[] args) {
        String text = "Cindarella and Sleeping Beauty sat in a tree";
        for(int i = 0; i < text.length(); i++)
            System.out.print("[" + i + "]" + text.charAt(i) + " ");
        System.out.println();
        Pattern pattern = Pattern.compile(".*Ariel.*|.*Sleeping Beauty.*");
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.matches());

        while(matcher.find()){
            System.out.println("Found match at: "  + matcher.start() + " to " + matcher.end()
            + ". This = " + text.substring(matcher.start(), matcher.end()));
        }
    }
}
