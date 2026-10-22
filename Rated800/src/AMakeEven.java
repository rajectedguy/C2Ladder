import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AMakeEven {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = reader.readLine().trim();
            int n = s.length();

            if ((s.charAt(n - 1) - '0') % 2 == 0) {
                sb.append(0).append("\n");
                continue;
            }

            if ((s.charAt(0) - '0') % 2 == 0) {
                sb.append(1).append("\n");
                continue;
            }

            boolean found = false;
            for (int i = 0; i < n; i++) {
                if ((s.charAt(i) - '0') % 2 == 0) {
                    found = true;
                    break;
                }
            }

            if (found) {
                sb.append(2).append("\n");
            } else {
                sb.append(-1).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
