package jenkovexpressionslerning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateMatcherExample {
    public static void main(String[] args) {
        String text = "This is the text to be searched " +
                "for occurrences of the http:// pattern.";

        String regex  = "This is the";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println(matcher.lookingAt());
        System.out.println(matcher.matches());
    }
}
