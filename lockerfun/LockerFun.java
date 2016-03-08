package lockerfun;

import java.util.*;

/**
 * @author DrewBritton
 */
public class LockerFun {

    public static void main(String[] args) {
        lockers(100, 100);
    }
    
    public static void lockers (int numLockers, int numStudents) {
        // create a new boolean array to represent lockers 1-100
        boolean[] openClose = new boolean[numLockers];
        
        // a nested for loop to represent each student who opens/closes
        // the locker doors
        for (int i = 0; i < numStudents; i++) {
            for (int j = i; j < openClose.length; j += i + 1) {
                openClose[j] = ! openClose[j];
            }
        }
        // output the boolean expressions of each locker
        System.out.println(Arrays.toString(openClose));
        System.out.println("\n");
        
        // create a copy of the numLockers array in order to closer
        // match the expected output
        String[] displayLockers = new String[openClose.length];
        
        // populate the copied array with characters that signify
        // which lockers are opened or closed (O = open, X = closed)
        for (int i = 0; i < openClose.length; i++) {
            if (openClose[i] == true) {
                displayLockers[i] = "O";    // open
            } else {
                displayLockers[i] = "X";    // closed
            }
        }
        
        // output the copied array
        System.out.println(Arrays.toString(displayLockers));
        System.out.println("\n");
        
        // present the copied array in an easier-to-read format
        for (int i = 0; i < displayLockers.length; i++) {
            if (i == 15 || i == 31 || i == 47 || i == 63 || i == 79 || i == 95) {
                System.out.println(displayLockers[i]);  // print w/ new line
            } else {
                System.out.print(displayLockers[i] + " ");
            }
                    
        }
        System.out.println("\n");
    }  
}
