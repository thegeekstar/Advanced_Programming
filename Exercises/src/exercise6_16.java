public class exercise6_16 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println("\t" + i);
            } else {
                System.out.print("\t" + i);
            }
        }
    }
}
