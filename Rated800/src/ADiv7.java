import java.util.Scanner;

public class ADiv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 7 == 0) {
                System.out.println(n);
            } else {
                int base = (n / 10) * 10;
                for (int i = 0; i <= 9; i++) {
                    if ((base + i) % 7 == 0) {
                        System.out.println(base + i);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
