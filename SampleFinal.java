// Andrew Britton
// Sample Final Exam

import java.util.*;

public class SampleFinal {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("goodbye");
        list.add("small");
        list.add("a");
        maxLength(list);
        
        Map<String, String> m = new TreeMap<>();
        m.put("sheep","wool");
        m.put("house","brick");
        m.put("cast","plaster");
        m.put("wool","wool");
        System.out.println(m);
        mapMystery2(m);
        Map<String, String> m2 = new TreeMap<>();
        m2.put("muchkin","blue");
        m2.put("winkie","yellow");
        m2.put("corn","yellow");
        m2.put("grass","green");
        m2.put("emerald","green");
        System.out.println(m2);
        mapMystery2(m2);
        Map<String, String> m3 = new TreeMap<>();
        m3.put("pumpkin","peach");
        m3.put("corn","apple");
        m3.put("apple","apple");
        m3.put("pie","fruit");
        m3.put("peach","peach");
        System.out.println(m3);
        mapMystery2(m3);
        Map<String, String> m4 = new TreeMap<>();
        m4.put("lab","ipl");
        m4.put("lion","cat");
        m4.put("terrier","dog");
        m4.put("cat","cat");
        m4.put("platypus","animal");
        m4.put("nyan","cat");
        System.out.println(m4);
        mapMystery2(m4);
        System.out.println();
        
        
        System.out.println(mystery(1, 3));
        System.out.println();
        System.out.println(mystery(4, 4));
        System.out.println();
        System.out.println(mystery(3, 5));
        System.out.println();
        System.out.println(mystery(1, 5));
        System.out.println();
        System.out.println(mystery(4, 7));
        System.out.println();
        
        Stack<Integer> s = new Stack<Integer>();
        s.
    }

// 2.
    public static int maxLength(List<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        System.out.println(max);
        System.out.println();
        return max;
    }
    
// 3.
    public static void mapMystery2(Map<String, String> m) {
        Set<String> s = new TreeSet<String>();
        for (String key : m.keySet()) {
            if (!m.get(key).equals(key)) {
                s.add(m.get(key));
            } else {
                s.remove(m.get(key));
            }
        }
        System.out.println(s);
    }
    
// 4.
    public static int mystery(int x, int y) {
        if (x > y) {
            return 0;
        } else {
            //System.out.println(x + ", " + y);
            return mystery(x + 1, y) + 2 * x - 1;
        }
    }
    
// 5.
    public static void mystery1(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            int n = s.pop();
            q.add(n);
            q.add(n);
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        System.out.println(s);
    }
    
// 6.
    public static String starString(int n) {
        if (n < 1) {
            return"*";
        } else {
            String str = starString(n - 1);
            return str + str;
        }
    }

// Extra credit
    private static boolean array6(int[] nums, int index) {
        if (index >= nums.length) {
            return false;
        } else {
            return (nums[index] == 6) || array6(nums, index + 1);
        }
    }
}