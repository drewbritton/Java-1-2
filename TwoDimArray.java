import java.util.*;

public class TwoDimArray {

    public static void main(String[] args) {
    
        int[][] twoDim = new int[3][4];
        
        for (int r = 0; r < twoDim.length; r++) {
            for (int c = 0; c < twoDim[r].length; c++) {
                twoDim[r][c] = r + c;
            }
        }
        
        System.out.print(Arrays.deepToString(twoDim));
        
    }
}