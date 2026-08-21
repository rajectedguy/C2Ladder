import java.util.Scanner;

public class BGCDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();
            long k = sc.nextLong();

            if (l == r) {
                if (l == 1) {
                    sb.append("NO\n");
                } else {
                    sb.append("YES\n");
                }
            } else {
                long odds = (r - l + 1) / 2;
                if (l % 2 != 0 && r % 2 != 0) {
                    odds++;
                }

                if (k >= odds) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }

        System.out.print(sb);
    }
}
