import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BGregorandthePawnGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            char[] enemy = br.readLine().trim().toCharArray();
            char[] gregor = br.readLine().trim().toCharArray();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (gregor[i] == '0') {
                    continue;
                }
                if (i > 0 && enemy[i - 1] == '1') {
                    enemy[i - 1] = '2';
                    ans++;
                }
                else if (enemy[i] == '0') {
                    enemy[i] = '2';
                    ans++;
                }
                else if (i < n - 1 && enemy[i + 1] == '1') {
                    enemy[i + 1] = '2';
                    ans++;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}