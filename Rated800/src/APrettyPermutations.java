import java.util.Scanner;

public class APrettyPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i+=2) {
                    System.out.print((i+1) + " " + i + " ");
                }
            }else{
                for (int i = 1; i <= n - 3; i+=2) {
                    System.out.print((i+1) + " " + i + " ");
                }
                System.out.print(n + " " + (n - 2) + " " + (n - 1) + " ");
            }
            System.out.println();
        }
    }
}
