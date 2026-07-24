import java.util.Scanner;

public class BAlphabeticalStrings {
    private static void solve(Scanner sc) {
        String sn = sc.next();
        char[] s = sn.toCharArray();
        int n = s.length;
        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; --i) {
            char expected = (char) ('a' + i);

            if (s[left] == expected) {
                left++;
            } else if (s[right] == expected) {
                right--;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }
}