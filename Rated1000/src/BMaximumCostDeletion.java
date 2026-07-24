import java.util.Scanner;

public class BMaximumCostDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            if (b >= 0) {
                System.out.println((a + b) * n);
            } else {
                int zero = 0, one = 0;
                if (s.charAt(0) == '0')
                    zero++;
                else
                    one++;
                for (int i = 1; i < n; i++) {
                    if (s.charAt(i) != s.charAt(i - 1)) {
                        if (s.charAt(i) == '0')
                            zero++;
                        else
                            one++;
                    }
                }
                int operations = Math.min(zero, one) + 1;
                System.out.println(a * n + b * operations);
            }
        }
    }
}