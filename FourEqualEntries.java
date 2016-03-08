/* Andrew Britton
 * 09/29/15
 * CPW 143 Java II
 * Programming Assignment 01
 */

import java.util.*;

public class FourEqualEntries {

    public static void main(String[] args) {
        System.out.println( "Test 1 = " + isAdjacentFour( test_1() ) );
        System.out.println( "Test 2 = " + isAdjacentFour( test_2() ) );
        System.out.println( "Test 3 = " + isAdjacentFour( test_3() ) );
        System.out.println( "Test 4 = " + isAdjacentFour( test_4() ) );
        System.out.println( "Test 5 = " + isAdjacentFour( test_5() ) );
        System.out.println( "Test 6 = " + isAdjacentFour( test_6() ) );
        System.out.println( "Test 7 = " + isAdjacentFour( test_7() ) );
    }
   
    // determines if a 2D array contains
    // four consecutive equal numbers
    // in a row, a column, or on a diagonal.
    public static boolean isAdjacentFour( int[][] a ) {
        int count = 1;
   
        // tests horizontally
        for (int rows = 0; rows < a.length; rows++) {
            for (int cols = 0; cols < a[rows].length - 1; cols++) {
                if (a[rows][cols + 1] == a[rows][cols]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }
      
        // tests vertically
        for (int cols = 0; cols < a[0].length; cols++) {
            for (int rows = 0; rows < a.length - 1; rows++) {
                if (a[rows + 1][cols] == a[rows][cols]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }
        
        // tests forward diagonal (NW to SE)
        for (int cols = 0; cols <= a[0].length - 2; cols++) {
            for (int rows = 0; rows <= a.length - 2; rows++) {
                if (a[rows][cols] == a[rows + 1][cols + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }

        // tests for backward diagonal (NE to SW)
        for (int rows = 0; rows <= a.length - 2; rows++) {
            for (int cols = a[rows].length - 1; cols >= a[rows].length - 3; cols--) {
                if (a[rows][cols] == a[rows +1][cols - 1] &&
                    a[rows + 1][cols - 1] == a[rows + 2][cols - 2] &&
                    a[rows + 2][cols - 2] == a[rows + 3][cols - 3]) {
                    return true;
                }
            }
        }
        
        return false;
   }
   
   // four in a row
   public static int[][] test_1() {
      return new int[][]
         { { 0, 1, 0, 3, 1, 6 },
           { 0, 1, 6, 8, 6, 0 },
           { 5, 6, 2, 1, 8, 2 },
           { 6, 5, 6, 1, 1, 9 },
           { 1, 3, 6, 1, 4, 0 },
           { 3, 3, 3, 3, 4, 0 } };
   }
   
   // four in a row
   public static int[][] test_2() {
      return new int[][]
         { { 0, 1, 0, 3, 1, 6 },
           { 0, 1, 6, 8, 6, 0 },
           { 5, 2, 2, 2, 2, 2 },
           { 6, 5, 6, 1, 1, 9 },
           { 1, 3, 6, 1, 4, 0 },
           { 4, 3, 3, 3, 4, 0 } };
   }
   
   // four in a column
    public static int[][] test_3() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
            { 0, 1, 6, 8, 6, 0, 1 },
            { 5, 5, 2, 1, 8, 2, 9 },
            { 6, 5, 6, 1, 1, 9, 1 },
            { 1, 5, 6, 1, 4, 0, 7 },
            { 3, 5, 3, 3, 4, 0, 7 } };
    }
   
    // four in a column
    public static int[][] test_4() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },    // 6
            { 0, 1, 6, 8, 6, 6, 1 },      // 6
            { 5, 5, 2, 1, 8, 6, 9 },      // 6
            { 6, 5, 6, 1, 1, 6, 1 },      // 6
            { 1, 5, 6, 1, 4, 0, 7 },
            { 3, 7, 3, 3, 4, 0, 7 } };
    }
   
    // four in a diagonal
    public static int[][] test_5() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
            { 0, 1, 6, 8, 6, 0, 1 },
            { 9, 6, 2, 1, 8, 2, 9 },   // 9
            { 6, 9, 6, 1, 1, 9, 1 },    // 9
            { 1, 3, 9, 1, 4, 0, 7 },     // 9
            { 3, 3, 3, 9, 4, 0, 7 } };    // 9
    }
   
    // four in a diagonal
    public static int[][] test_6() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
            { 0, 1, 6, 8, 6, 0, 1 },
            { 5, 6, 2, 1, 6, 2, 9 },         // 6
            { 6, 5, 6, 6, 1, 9, 1 },        // 6
            { 1, 3, 6, 1, 4, 0, 7 },       // 6
            { 3, 6, 3, 3, 4, 0, 7 },      // 6
            { 1, 2, 1, 2, 1, 2, 1 } };
    }
   
    // no sequence of four
    public static int[][] test_7() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6 },
            { 0, 1, 6, 8, 6, 0 },
            { 9, 6, 2, 1, 8, 2 },
            { 6, 9, 6, 1, 6, 6 },
            { 1, 3, 9, 1, 4, 0 } };
    }
}
