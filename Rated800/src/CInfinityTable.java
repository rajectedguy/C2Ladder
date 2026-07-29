import java.util.Scanner;

public class CInfinityTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long m = (long) Math.ceil(Math.sqrt(k));
            long mid = m * m - m + 1;
            long r, c;
            if (k <= mid) {
                r = k - (m - 1) * (m - 1);
                c = m;
            } else {
                r = m;
                c = m * m - k + 1;
            }
            System.out.println(r + " " + c);
        }
        sc.close();
    }
}
