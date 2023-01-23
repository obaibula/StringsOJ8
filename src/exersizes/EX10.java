package exersizes;

/*Exercise 10: (2) For the phrase "Java now has regular expressions" evaluate whether the
following expressions will find a match:
^Java
\Breg.*
n.w\s+h(a|i)s
s?
s*
s+
s{4}
S{1}.
s{0,3}
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX10 {

    static String text = "Java now has regular expressions";

    static void test(String regex) {
        Matcher matcher = Pattern.compile(regex)
                .matcher(text);
        System.out.println("regex = " + regex + "/n");
        while (matcher.find()){
            System.out.println("\"" + matcher.group() + "\" matches "+ regex + " at:" +
                    matcher.start() + " : " + (matcher.end()-1));
        }
    }

    public static void main(String[] args) {
        test("^Java");
        test("Breg.*");
        test("n.w\\s+h(a|i)s");
        test("s?");
        test("s*");
        test("S{1}.");
        test("s{0,3}");
    }
}
