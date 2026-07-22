import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AFindTheArray {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int s = Integer.parseInt(br.readLine().trim());
            int ans = (int) Math.ceil(Math.sqrt(s));
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}