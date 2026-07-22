import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AEzzatandTwoSubsequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long t = Long.parseLong(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            long sum = 0;
            long maxVal = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                long c = Long.parseLong(st.nextToken());
                sum += c;
                if (c > maxVal) {
                    maxVal = c;
                }
            }
            double r = (double) (sum - maxVal) / (n-1);
            double p = maxVal+r;
            System.out.println(p);
        }
    }
}