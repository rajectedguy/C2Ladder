import java.util.ArrayList;
import java.util.Scanner;

public class BArrayReodering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> even = new ArrayList<Integer>();
            ArrayList<Integer> odd = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) {
                    even.add(arr[i]);
                } else {
                    odd.add(arr[i]);
                }
            }
            ArrayList<Integer> reorder = new ArrayList<Integer>();
            reorder.addAll(even);
            reorder.addAll(odd);
            int count = 0;
            for (int i = 0; i < reorder.size(); i++) {
                for (int j = i + 1; j < reorder.size(); j++) {
                    if (gcd(reorder.get(i), 2 * reorder.get(j)) > 1) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
