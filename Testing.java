import java.util.*;

public class Testing {

    public static void main(String[] args) {
    
        int[] list = {7, 13, 11, 42, 50};
    
        for (int i = 0; i < list.length; i++) {
            if (list.binarySearch(7) && list.contains(11) && list.contains(13) &&
                list.contains(42)) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}