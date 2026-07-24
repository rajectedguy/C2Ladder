import java.util.Scanner;

public class BCustomisingtheTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[Math.toIntExact(n)];
            long sum = 0;
            for (long i = 0; i < n; ++i){
                arr[Math.toIntExact(i)] = sc.nextInt();
                sum += arr[Math.toIntExact(i)];
            }
            long rem = sum % n;
            long ans = rem * (n - rem);
            System.out.println(ans);
        }
    }
}
