
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BMinority {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            int c0 = 0;
            int c1 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    c0++;
                } else {
                    c1++;
                }
            }

            if (c0 != c1) {
                sb.append(Math.min(c0, c1)).append("\n");
            } else {
                sb.append(c0 - 1).append("\n");
            }
        }
        System.out.print(sb);
    }
}