package Assignment1;

public class pythagorean_triplet {
    public static void main(String[] args) {
        int limit = 20;

        for (int a = 1; a < limit; a++) {
            for (int b = a + 1; b < limit; b++) {
                for (int c = b + 1; c < limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }
}


