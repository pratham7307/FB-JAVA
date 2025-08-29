package Pattern;
public class pattern28 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // Print first number
            System.out.print(i + " ");

            // Print middle zeros
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print("0 ");
            }

            // Print last number if i > 1
            if (i > 1) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}


