import java.util.Scanner;

public class AEshagLovesBigArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int mini = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                mini = Math.min(mini, arr[i]);
            }
            int count = 0;
            for(int i=0;i<n;i++){
                if(arr[i]==mini){
                    count++;
                }
            }
            System.out.println(n - count);
        }
    }
}
