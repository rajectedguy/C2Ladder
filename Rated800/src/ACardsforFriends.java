import java.util.Scanner;

public class ACardsforFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long w = scanner.nextLong();
            long h = scanner.nextLong();
            long n = scanner.nextLong();
            long count = 1;
            while (w % 2 == 0) {
                count *= 2;
                w /= 2;
            }
            while (h % 2 == 0) {
                count *= 2;
                h /= 2;
            }
            if (count >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}