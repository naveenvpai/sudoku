/**
 * Created by Naveen on 5/26/16.
 */
public class Main {
    public static void main(String[] args) {
        int length = 1;
        while (length < 36) {
            for (int i = 0; i < length; i++) {
                print(locateGrid(i, length));
            }
            System.out.println("******");
            length = (int)Math.pow((int)Math.sqrt(length)+1,2);
        }
    }

    private static int[] locateGrid(int index, int puzzleLength) {
        int gridLength = (int)Math.sqrt(puzzleLength);
        int startColumn  = (index%gridLength)*gridLength;
        int startRow     = index-(index%gridLength);
        return a(startRow,startColumn);
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
