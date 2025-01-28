import java.util.HashMap;
import java.util.Map;

public class segmentdisplay {

    static Map<int[][], String> characterMap;

    static {
        characterMap = new HashMap<>();
        characterMap.put(new int[][]{
                {1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1}}, "T");

        characterMap.put(new int[][]{
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1}}, "C");

        characterMap.put(new int[][]{
                {1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 1, 1}}, "S");
    }

    public static String decodeSegmentDisplay(String input) {
        int numCols = input.length() / 9;
        int[][] grid = new int[9][numCols];

        // Convert input string into 9xN grid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < numCols; j++) {
                grid[i][j] = input.charAt(i * numCols + j) - '0';
            }
        }

        // Debugging: Print the grid
        System.out.println("Grid:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        StringBuilder result = new StringBuilder();
        int col = 0;

        while (col < numCols) {
            if (col + 5 > numCols) break;

            int[][] segment = new int[9][5];
            boolean isPadding = true;

            // Extract the segment
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 5; j++) {
                    segment[i][j] = grid[i][col + j];
                    if (segment[i][j] == 1) {
                        isPadding = false;
                    }
                }
            }

            // Debugging: Print the segment
            System.out.println("Checking segment starting at column " + col + ":");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(segment[i][j]);
                }
                System.out.println();
            }

            if (!isPadding && characterMap.containsKey(segment)) {
                result.append(characterMap.get(segment));
                col += 5;
            } else {
                col++;
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String input = "111110000011111011111" +
                       "001000000010000010000" +
                       "001000000010000010000" +
                       "001000000010000010000" +
                       "001000000010000011111" +
                       "001000000010000000001" +
                       "001000000010000000001" +
                       "001000000010000000001" +
                       "001000000011111011111";

        // Decode and print the result
        String output = decodeSegmentDisplay(input);
        System.out.println("Decoded Output: " + output);
    }
}
