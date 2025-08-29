package Pattern;

public class pattern26 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Print decreasing numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }


}
