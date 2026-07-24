import java.util.Scanner;

public class BMochaandRedandBlue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            int firstKnownIndex = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] != '?') {
                    firstKnownIndex = i;
                    break;
                }
            }
            if (firstKnownIndex == -1) {
                arr[0] = 'B';
                firstKnownIndex = 0;
            }
            for (int i = firstKnownIndex - 1; i >= 0; i--) {
                arr[i] = (arr[i + 1] == 'B') ? 'R' : 'B';
            }
            for (int i = firstKnownIndex + 1; i < n; i++) {
                if (arr[i] == '?') {
                    arr[i] = (arr[i - 1] == 'B') ? 'R' : 'B';
                }
            }
            System.out.println(new String(arr));
        }
        sc.close();
    }
}