import java.util.Arrays;
import java.util.Scanner;

public class AConstructaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            long[] l = new long[3];
            l[0] = sc.nextLong();
            l[1] = sc.nextLong();
            l[2] = sc.nextLong();
            Arrays.sort(l);
            if (l[2] == l[0] + l[1]) {
                System.out.println("YES");
            }
            else if (l[0] == l[1] && l[2] % 2 == 0) {
                System.out.println("YES");
            }
            else if (l[1] == l[2] && l[0] % 2 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}