import java.util.Scanner;

public class AAndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = 1;
            while (true) {
                if(x*2 > n){
                    System.out.println(x-1);
                    break;
                }
                x *= 2;
            }
        }
    }
}
