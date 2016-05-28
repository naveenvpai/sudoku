/**
 * Created by Naveen on 5/26/16.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (Math.sqrt((double)i)%1==0) System.out.println(i);
        }
    }

    private int[] a(int... els) {
        return els;
    }
    private int[][] m(int[]... rows) {
        return rows;
    }
}
