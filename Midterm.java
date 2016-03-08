/* Java II Midterm Questions and Solutions
Fall 2015  */

import java.util.*;

public class Midterm {

    public static void main(String[] args) {
    
    }
    
    public static void mystery(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length - 1; j++) {
                if (a[i][j + 1] > a[i][j]) {
                    a[i][j] *= 2;
                }
            }
        }
        
        /* What would be the output of the following code:
        */
        int[][] b = { {1, 2, 3}, {3, 3, 4} };
    }