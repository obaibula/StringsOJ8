package jenkovexpressionslerning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExamples {
    public static void main(String[] args) {
        String text = "HtTP//This is the text.";
        String regex = ".*http//.*";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        Boolean match = matcher.matches();

        System.out.println(match);
    }
}
