import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/** K번째 수 */
public class LvOne006 {
    
    /**
     * @author swd
     * @param  array, commands 
     * @return answer
     * 
     * 1트 효율성에서 통과하지 못함
     */
    public static int[] mySolution(int[] array, int[][] commands) {
        int[] answer = new int[3];
        int count = 0;
        
        for (int[] command : commands) {
            
            ArrayList<Integer> tempArrays = new ArrayList<>();
            
            for (int i = command[0] -1; i < command[1]; i++) {
                tempArrays.add(array[i]);
            }
            
            tempArrays.sort(Comparator.naturalOrder());
            answer[count] = tempArrays.get(command[2] - 1);
            count++;
        }
        
        return answer;
    }
    
    /**
     * @author swd
     * @param  array, commands 
     * @return answer
     * 2트
     */
    public static int[] mySolutionTryTwo(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        for (int[] command : commands) {
            int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(temp);
            answer[count] = temp[command[2]-1];
            count++;
        }
        
        return answer;
    }
    
    @Test
    public void Test() {
        int[] expected = new int[]{5, 6, 3};
        
        Assert.assertArrayEquals(
                expected, 
                LvOne006.mySolution(
                        new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
                )
        );
        
        Assert.assertArrayEquals(
                expected,
                LvOne006.mySolutionTryTwo(
                        new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
                )
        );
    }
    
    public static void main(String[] args) {
        int[] resultFromMySolution = LvOne006.mySolution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}        
        );
        
        System.out.println(Arrays.toString(resultFromMySolution));
        
        int[] resultFromMySolutionTryTwo = LvOne006.mySolutionTryTwo(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
        );
        
        System.out.println(Arrays.toString(resultFromMySolutionTryTwo));
    }
}
