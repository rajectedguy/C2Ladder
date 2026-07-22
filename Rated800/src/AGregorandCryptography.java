import java.util.Scanner;

public class AGregorandCryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println(2 + " " + (n -1));
        }
    }
}
