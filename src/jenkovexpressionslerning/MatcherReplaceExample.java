package jenkovexpressionslerning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherReplaceExample {
    public static void main(String[] args) {
        String text = "John writes about this, and John Doe writes about that," +
                " and John Wayne writes about everything.";
        String regex = "[^aouei]";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        StringBuffer stringBuffer = new StringBuffer();

        while(matcher.find()){
            String test = new String((matcher.group().charAt(0)) + 1);
            matcher.appendReplacement(stringBuffer, matcher.group());
        }
        matcher.appendTail(stringBuffer);

        System.out.println(stringBuffer);
    }
}
