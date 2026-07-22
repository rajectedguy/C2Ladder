import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ANastiaandNearlyGoodNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            if (b == 1) {
                sb.append("NO\n");
            } else {
                long x = a;
                long y = a * b;
                long z = a * (b + 1);
                sb.append("YES\n");
                sb.append(x).append(" ").append(y).append(" ").append(z).append("\n");
            }
        }
        System.out.print(sb);
    }
}