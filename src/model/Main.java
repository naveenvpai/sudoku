/**
 * Created by Naveen on 5/26/16.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (Math.sqrt((double)i)%1==0) System.out.println(i);
        }
        print(m(a(1,2,3,4),a(5,6,7,8)));
    }

    private static int[] a(int... els) {
        return els;
    }

    private static int[][] m(int[]... rows) {
        return rows;
    }

    private static void print(int... els) {
        for (int i = 0; i < els.length; i++) {
            String spacer = i > 0 ? " " : "";
            System.out.print(spacer+els[i]);
        }
        System.out.println();
    }

    private static void print(int[]... rows) {
        for (int[] row : rows) {
            print(row);
        }
    }
}
