package Pattern;

public class pattern26 {
     public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }
            int num=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }

}
