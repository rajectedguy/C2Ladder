import java.util.Scanner;

public class ADislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int k = sc.nextInt();
            int c = 0;
            for (int i = 1; i <= k; i++) {
                do {
                    c++;
                } while (c % 3 == 0 || c % 10 == 3);
            }
            System.out.println(c);
        }
    }
}
