import java.util.Scanner;

public class B1WonderfulColoring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            int count2 = 0;
            int count1 = 0;
            for (int f : freq) {
                if (f >= 2) {
                    count2++;
                } else if (f == 1) {
                    count1++;
                }
            }
            int ans = count2 + (count1 / 2);
            System.out.println(ans);
        }
        sc.close();
    }
}