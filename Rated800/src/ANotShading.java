import java.util.Scanner;

public class ANotShading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            boolean hasBlack = false;
            boolean inRowOrCol = false;
            boolean isTargetBlack = false;

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                for (int j = 0; j < m; j++) {
                    if (row.charAt(j) == 'B') {
                        hasBlack = true;
                        if (i == r && j == c) {
                            isTargetBlack = true;
                        }
                        if (i == r || j == c) {
                            inRowOrCol = true;
                        }
                    }
                }
            }

            if (isTargetBlack) {
                System.out.println(0);
            } else if (inRowOrCol) {
                System.out.println(1);
            } else if (hasBlack) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
