/**
 * Created by Naveen on 5/26/16.
 */
public class Main {
    public static void main(String[] args) {
        int[][] testPuzzle =  m(a(0,0,0,0,0,1,5,0,0),
                                a(5,0,0,3,0,0,0,0,0),
                                a(1,4,2,6,0,0,3,0,0),
                                a(6,0,0,7,5,0,4,2,0),
                                a(8,0,0,0,9,0,0,1,0),
                                a(7,2,0,4,0,0,9,3,6),
                                a(0,0,0,0,6,0,0,0,0),
                                a(0,1,8,0,7,0,0,0,0),
                                a(9,5,0,0,0,0,0,8,0));
        print(testPuzzle);
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
