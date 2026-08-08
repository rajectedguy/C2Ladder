import java.util.Arrays;
import java.util.Scanner;

public class ADownloadMoreRAM {
    static class Software implements Comparable<Software> {
        int req;
        int gain;

        Software(int req, int gain) {
            this.req = req;
            this.gain = gain;
        }

        @Override
        public int compareTo(Software other) {
            return Integer.compare(this.req, other.req);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Software[] s = new Software[n];
            for (int i = 0; i < n; i++) {
                s[i] = new Software(a[i], b[i]);
            }

            Arrays.sort(s);

            for (int i = 0; i < n; i++) {
                if (k >= s[i].req) {
                    k += s[i].gain;
                } else {
                    break;
                }
            }

            System.out.println(k);
        }
        sc.close();
    }
}
