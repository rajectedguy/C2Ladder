import java.util.Scanner;

public class ADominoDisaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'U') {
                    sb.append('D');
                } else if (c == 'D') {
                    sb.append('U');
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
