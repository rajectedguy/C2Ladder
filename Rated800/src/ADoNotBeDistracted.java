import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ADoNotBeDistracted {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            boolean[] v = new boolean[26];
            boolean b = false;
            for (int i = 0; i < n; i++) {
                if(i == 0 || s.charAt(i - 1) != s.charAt(i) ) {
                    int ti = s.charAt(i) - 'A';
                    if(v[ti]) {
                        b = true;
                        break;
                    }
                    v[ti] = true;
                }
            }
            if(b) {
                System.out.println("NO");
            }else  {
                System.out.println("YES");
            }
        }
    }
}
