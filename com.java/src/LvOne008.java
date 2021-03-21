import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LvOne008 {
    
    public static int[] mySolution(int[] arr) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for (int key : arr) {
            if (hash.size() == 0) {
                hash.put(key, 0);
                continue;
            }
            
            if (!hash.containsKey(key)) {
                hash.put(key, 0);
            }
        }
        
        int answer [] = new int[hash.size()];
        int count = 0;
        for (int key : hash.keySet()) {
            answer[count] = key;
            count++;
        }
        
        return answer; 
    }
    
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 3, 3, 0, 1, 1};
        int[] expectedAnswer = new int[] {4, 4, 4, 3, 3};
        
        int[] answer = LvOne008.mySolution(arr);
        System.out.println(Arrays.toString(answer));
    }
}
