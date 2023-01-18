package exersizes;

/*Exercise 6: (2) Create a class that contains int, long, float and double fields. Create a
toString( ) method for this class that uses String.format( ), and demonstrate that your
class works correctly. */

public class EX6 {
    int i = 4;
    long l = 400l;
    float f = 0.14f;
    double d = 0.44d;
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("EX6: \n");
        result.append(String.format("int: %d%n", i));
        result.append(String.format("long: %d%n", l));
        result.append(String.format("float: %.2f%n", f));
        result.append(String.format("double: %.2f%n", d));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new EX6());
    }
}
