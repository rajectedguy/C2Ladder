import java.util.Scanner;

public class BOrdinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count = 0;
            for (int i = 1; i <= 9; i++) {
                long c = i;
                while (c <= n) {
                    count += 1;
                    c = c * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}
