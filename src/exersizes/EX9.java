package exersizes;

/*Exercise 9: (4) Using the documentation for java.util.regex.Pattern as a resource,
replace all the vowels in Splitting.knights with underscores. */

public class EX9 {
    public static String knights =
            "Then, when you have found the shrubbery, " +
                    "you must cut down the mightiest tree in the " +
                    "forest...with... a herring!";

    public static void main(String[] args) {
        System.out.println( knights.replaceAll("[aeiou]","_"));
    }
}
