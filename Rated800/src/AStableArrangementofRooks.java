import java.util.Scanner;

public class AStableArrangementofRooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k > (n + 1) / 2) {
                System.out.println(-1);
            } else {
                int placed = 0;
                for (int i = 0; i < n; i++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < n; j++) {
                        if (i == j && i % 2 == 0 && placed < k) {
                            sb.append('R');
                            placed++;
                        } else {
                            sb.append('.');
                        }
                    }
                    System.out.println(sb.toString());
                }
            }
        }
        sc.close();
    }
}
