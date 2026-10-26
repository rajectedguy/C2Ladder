import java.util.Scanner;

public class AConsecutiveSumRiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(-(n - 1) + " " + n);
        }
        scanner.close();
    }
}
