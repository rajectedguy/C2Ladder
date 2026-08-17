import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AIntegerDiversity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> counts = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int val = Math.abs(sc.nextInt());
                counts.put(val, counts.getOrDefault(val, 0) + 1);
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
                int val = entry.getKey();
                int count = entry.getValue();
                if (val == 0) {
                    ans += 1;
                } else {
                    ans += Math.min(2, count);
                }
            }
            System.out.println(ans);
        }
    }
}
