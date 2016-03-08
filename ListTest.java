//[10, 20, 30, 40]
import java.util.*;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(72);  // for first part of the question
        list.add(20);
        /*
        list.add(10);  // for second part of the problem
        list.add(20);
        list.add(30);
        list.add(40);
        */
        
        for (int i = list.size()-2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i+1);
            list.set(i, a + b);
        }
        System.out.println(list);
    }
}