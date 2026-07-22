import java.util.Scanner;

public class AShortestPathwithObstacle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int xa = sc.nextInt();
                int ya = sc.nextInt();
                int xb = sc.nextInt();
                int yb = sc.nextInt();
                int xf = sc.nextInt();
                int yf = sc.nextInt();
                int dist = Math.abs(xa - xb) + Math.abs(ya - yb);
                if(xa == xb && xb == xf && Math.min(ya, yb) < yf && yf < Math.max(ya, yb)){
                    dist+=2;
                }
                if(ya == yb && yb == yf && Math.min(xa, xb) < xf && xf < Math.max(xa, xb)){
                    dist+=2;
                }
                System.out.println(dist);
            }
        }
    }
}
