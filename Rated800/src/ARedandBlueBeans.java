import java.util.Scanner;

public class ARedandBlueBeans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();

            long min = Math.min(r, b);
            long max = Math.max(r, b);

            if (max <= min * (d + 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
