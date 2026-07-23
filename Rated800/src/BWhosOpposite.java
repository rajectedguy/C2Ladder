import java.util.Scanner;

public class BWhosOpposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int diff = Math.abs(a - b);
            int n = 2 * diff;
            if(a > n || b > n || c > n){
                System.out.println(-1);
            } else {
                if(c <= diff){
                    System.out.println(c + diff);
                }else {
                    System.out.println(c - diff);
                }
            }
        }
    }
}
