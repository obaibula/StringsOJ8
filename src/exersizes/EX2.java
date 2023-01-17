package exersizes;

import java.util.stream.Stream;

public class EX2 {
    @Override public String toString() {
        return
                " InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void main(String[] args) {
        Stream.generate(EX2::new)
                .limit(10)
                .forEach(System.out::println);
    }
}
