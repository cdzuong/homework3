package main;

/** StarPatterns class.
 * You will use nested for-loops to generate several patterns of stars and minuses.
 */
public class StarPatterns {

    /**
     * Outputs a square of asterisks to the console, where each line has
     * n asterisks and there are n lines.
     * @param n number of stars in each line; number of lines
     */
    public static void drawSquare(int n) {
        // FILL IN CODE

    }

    /**
     * Outputs a pattern of "two triangles" to the console,
     * where on the bottom left is a triangle
     * of asterisks, and on the right is the triangle of minuses
     * (see homework description for examples).
     * The number of asterisks on each line changes from 1 to n
     * (the bottom line has n asterisks). The number of minuses in each line
     * changes from n - 1 to 0.
     * @param n number of lines; number of stars in the bottom line.
     */
    public static void drawTwoTriangles(int n) {
        // FILL IN CODE


    }

    /**
     * Outputs a "three-triangles pattern" to the console with n stars
     * in the bottom  (see homework description for details).
     * @param n odd integer; number of stars in the last line
     */
    public static void drawThreeTriangles(int n) {
        // FILL IN CODE

    }

    /**
     * Invokes methods of StarPatterns class to draw different patterns.
     *
     * @param args command line arguments; not used in this program
     */
    public static void main(String[] args) {
        // Use this method to "test" your code
        StarPatterns.drawSquare(7);
        System.out.println();
        StarPatterns.drawTwoTriangles(7);
        System.out.println();
        StarPatterns.drawThreeTriangles(9);
    }
}
