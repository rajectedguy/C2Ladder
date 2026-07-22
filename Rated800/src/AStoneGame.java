import java.io.IOException;
import java.util.Scanner;

public class AStoneGame {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int minPos = 0;
            int maxPos = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < a[minPos]) {
                    minPos = i;
                }
                if (a[i] > a[maxPos]) {
                    maxPos = i;
                }
            }
            int pos1 = minPos + 1;
            int pos2 = maxPos + 1;
            int L = Math.min(pos1, pos2);
            int R = Math.max(pos1, pos2);
            int ans1 = R;
            int ans2 = n - L + 1;
            int ans3 = L + (n - R + 1);
            int finalAns = Math.min(ans1, Math.min(ans2, ans3));
            System.out.println(finalAns);
        }
        sc.close();
    }
}