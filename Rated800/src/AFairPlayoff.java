import java.util.Scanner;

public class AFairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s1, s2, s3, s4;
            s1 = sc.nextInt();
            s2 = sc.nextInt();
            s3 = sc.nextInt();
            s4 = sc.nextInt();
            int w1 = Math.max(s1, s2);
            int w2 = Math.max(s3, s4);
            int l1 = Math.min(s1, s2);
            int l2 = Math.min(s3, s4);
            if (w1 < l2 || w2 < l1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
