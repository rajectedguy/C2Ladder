import java.util.Arrays;
import java.util.Scanner;

public class ASubsequencePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] original = s.toCharArray();
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (original[i] != sorted[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}