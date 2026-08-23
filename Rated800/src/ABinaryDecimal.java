import java.util.Scanner;

public class ABinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            int maxDigit = 0;
            for (int i = 0; i < n.length(); i++) {
                int digit = n.charAt(i) - '0';
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }
            System.out.println(maxDigit);
        }

        sc.close();
    }
}
