package exersizes;

/*Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by a single set of
constant values. The goal is to allow you to easily change a width by changing a single value
in one place. */

import java.util.Formatter;

public class EX4 {
    private double total = 0;
    private Formatter f =
            new Formatter(new StringBuilder());
    private final int WIDTH1 = 15,
            WIDTH2 = 5, WIDTH3 = 10;
    private final String TITLE_FRM = "%-" + WIDTH1 +
            "s %" + WIDTH2 + "s %" + WIDTH3 + "s%n";
    private final String ITEM_FRM = "%-" + WIDTH1 + "." + WIDTH1 +
            "s %" + WIDTH2 + "d %" + WIDTH3 + ".2f%n";
    private final String TOTAL_FRM = "%-" + WIDTH1 +
            "s %" + WIDTH2 + "s %" + WIDTH3 + ".2f%n";

    public EX4(){
        f.format(TITLE_FRM, "Item", "Qty", "Price");
        f.format(TITLE_FRM, "----", "---", "-----");
    }

    public void add(String name, int qty, double price) {
        f.format(ITEM_FRM, name, qty, price);
        total += price * qty;
    }

    public String build() {
        f.format(TOTAL_FRM, "Tax", "", total * 0.06);
        f.format(TITLE_FRM, "", "", "-----");
        f.format(TOTAL_FRM, "Total", "", total * 1.06);
        return f.toString();
    }

    public static void main(String[] args) {
        EX4 receiptBuilder = new EX4();
        receiptBuilder.add("Банани", 2, 50.45);
        receiptBuilder.add("Снікерс", 6, 12.67);
        receiptBuilder.add("Манго", 1, 546.85);
        System.out.println(receiptBuilder.build());
    }
}
