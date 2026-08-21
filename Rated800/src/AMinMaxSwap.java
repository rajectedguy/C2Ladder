import java.util.Scanner;

public class AMinMaxSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int maxA = 0;
            int maxB = 0;
            for (int i = 0; i < n; i++) {
                int maxVal = Math.max(a[i], b[i]);
                int minVal = Math.min(a[i], b[i]);
                maxA = Math.max(maxA, maxVal);
                maxB = Math.max(maxB, minVal);
            }
            System.out.println((long) maxA * maxB);
        }
        sc.close();
    }
}
