import java.util.Scanner;

public class AArithmeticArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if(sum==n)
            {
                System.out.println(0);
            } else if (sum < n) {
                System.out.println(1);
            } else {
                System.out.println(sum - n);
            }
        }
    }
}
