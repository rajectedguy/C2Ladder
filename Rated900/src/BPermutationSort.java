import java.util.Scanner;

public class BPermutationSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean b = true;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if (a[i] != i + 1){
                    b = false;
                }
            }
            if (b) {
                System.out.println(0);
            } else if (a[0] == 1 || a[n - 1] == n) {
                System.out.println(1);
            } else if (a[0] == n && a[n - 1] == 1) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
    }
}
