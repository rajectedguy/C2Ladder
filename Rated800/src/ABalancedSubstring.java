import java.util.Scanner;

public class ABalancedSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int ansL = -1, ansR = -1;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    ansL = i + 1;
                    ansR = i + 2;
                    break;
                }
            }
            if (ansL != -1) {
                System.out.println(ansL + " " + ansR);
            } else {
                System.out.println("-1 -1");
            }
        }
    }
}
