import java.util.Scanner;

public class ALongComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            long x1 = sc.nextLong();
            int p1 = sc.nextInt();
            long x2 = sc.nextLong();
            int p2 = sc.nextInt();
            int c1 = String.valueOf(x1).length();
            int c2 = String.valueOf(x2).length();
            int l1 = c1 + p1;
            int l2 = c2 + p2;
            if (l1 > l2) {
                System.out.println(">");
            } else if (l1 < l2) {
                System.out.println("<");
            } else {
                while (c1 < c2) {
                    x1 *= 10;
                    c1++;
                }
                while (c2 < c1) {
                    x2 *= 10;
                    c2++;
                }
                if (x1 > x2) {
                    System.out.println(">");
                } else if (x1 < x2) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            }
        }
    }
}