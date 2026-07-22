import java.util.Scanner;

public class AOddSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int e = 0;
            int o = 0;
            int[] arr = new int[2*n];
            for (int i = 0; i < 2*n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    e++;
                }else {
                    o++;
                }
            }
            if (e == o) {
                System.out.println("YES");
            }else  {
                System.out.println("NO");
            }
        }
    }
}
