import java.util.*;

public class TAsExperience {
    public static void main(String[] args) {
        String[] names = {"Allison", "Alyssa", "Brian", "Kasey"};
        int[] experience = {5, 8, 1, 5};
        
        Map<Integer, List<String>> namesInOrder
                            = new TreeMap<Integer, List<String>>();
       
        for (int i = 0; i < experience.length; i++) {
            if (!namesInOrder.containsKey(experience[i])) {
                namesInOrder.put(experience[i], new ArrayList<String>());
            }
            namesInOrder.get(experience[i]).add(names[i]);
        }
        
        for (int i : namesInOrder.keySet()) {
            System.out.println(i + " qtr: " + namesInOrder.get(i));
        }
    }
}