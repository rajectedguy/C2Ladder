import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class AOmkarandBadStory {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            boolean hasNegative = false;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] < 0) {
                    hasNegative = true;
                }
            }

            if (hasNegative) {
                out.println("NO");
            } else {
                out.println("YES");
                out.println(101);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i <= 100; i++) {
                    sb.append(i).append(" ");
                }
                out.println(sb.toString().trim());
            }
        }
        out.flush();
    }
}