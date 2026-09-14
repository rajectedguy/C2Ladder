import java.util.Scanner;

public class APolycarpandSumsofSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            long[] b = new long[7];
            for (int i = 0; i < 7; i++) {
                b[i] = sc.nextLong();
            }
            long a1 = b[0];
            long a2 = b[1];
            long a3 = b[6] - a1 - a2;
            System.out.println(a1 + " " + a2 + " " + a3);
        }
        sc.close();
    }
}
