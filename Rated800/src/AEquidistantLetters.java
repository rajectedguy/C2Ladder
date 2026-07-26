import java.util.Arrays;
import java.util.Scanner;

public class AEquidistantLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            String s = input.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
