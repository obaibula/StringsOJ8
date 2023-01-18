

public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-12".matches("-\\d+"));
        System.out.println("5678".matches("-\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}

