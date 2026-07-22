import java.util.Scanner;

public class APolycarpandCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = Math.abs(n / 3);
            int rem = n % 3;
            if(rem == 0){
                System.out.println(k + " " + k);
            } else if (rem == 1) {
                System.out.println((k + 1) + " " + k);
            }else {
                System.out.println(k + " " + (k + 1));
            }
        }
    }
}
