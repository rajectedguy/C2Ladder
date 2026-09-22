import java.util.Scanner;

public class BSquaresandCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long countSquares = (long) Math.sqrt(n);
            long countCubes = (long) Math.cbrt(n);
            long countSixthPowers = (long) Math.sqrt(Math.cbrt(n));

            System.out.println(countSquares + countCubes - countSixthPowers);
        }
        sc.close();
    }
}
