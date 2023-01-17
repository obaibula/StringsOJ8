package exersizes;

import java.io.*;
import java.util.*;

public class EX3_Turtle {
    private final String name;
    private final Formatter f;
    public EX3_Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)%n",
                name, x, y);
    }
    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        EX3_Turtle tommy = new EX3_Turtle("Tommy",
                new Formatter(System.err));
        EX3_Turtle terry = new EX3_Turtle("Terry",
                new Formatter(outAlias));
        tommy.move(0,0);
        terry.move(4,8);
        tommy.move(3,4);
        terry.move(2,5);
        tommy.move(3,3);
        terry.move(3,3);
    }
}
