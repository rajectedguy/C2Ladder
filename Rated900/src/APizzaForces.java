import java.util.Scanner;

public class APizzaForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n > 6){
                if (n % 2 == 1){
                    n++;
                }
                System.out.println((n*5)/2);
            }else {
                System.out.println(15);
            }
        }
    }
}
