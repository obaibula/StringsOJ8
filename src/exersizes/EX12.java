package exersizes;

/*Exercise 12: (5) Modify Groups.java to count all of the unique words that do not start
with a capital letter. */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.*;

public class EX12 {
    public static final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Matcher m = Pattern.compile(
                "\\b((?![A-Z])\\w+)\\b")
                .matcher(POEM);
        while(m.find()) {
            words.add(m.group(1));
        }

        System.out.println(words.size());
        System.out.println(words);
    }
}

