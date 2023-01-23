package exersizes;

/*Exercise 11: (2) Apply the regular expression
(?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b
to
"Arline ate eight apples and one orange while Anita hadn’t any"
*/



import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX11 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher matcher  = pattern.matcher("Arline ate eight apples and one orange while Anita hadn’t any");
        while (matcher.find()){
            System.out.println(matcher.group() + " has found at — " +
                    matcher.start() + " : " + (matcher.end()-1));
        }
    }
}
