package jenkovexpressionslerning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFindStartEndExample {
    public static void main(String[] args) {
        String text =
                "This is the text which is to be searched " +
                        "for occurrences of the word 'is'.";

        String patternString = "is";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println(
                    "found:" + count +
                            " : " + matcher.start() +
                            " - " + matcher.end());
        }
    }
}/*
found: 1 : 2 - 4
found: 2 : 5 - 7
found: 3 : 23 - 25
found: 4 : 70 - 72*/
