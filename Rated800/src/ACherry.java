import java.util.Scanner;

public class ACherry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[Math.toIntExact(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long mv = 0;
            for (int i = 0; i < n - 1; i++) {
                long cv = arr[i] * arr[i + 1];
                mv = Math.max(mv, cv);
            }
            System.out.println(mv);
        }
    }
}