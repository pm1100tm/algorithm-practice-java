import java.util.*;

/** 두 개 뽑아서 더하기 */
public class LvOne003 {
    /**
     * @author pm1100tm
     * @param numbers
     * @return String: int[]
     */
    public int[] mySolution(int[] numbers){
        ArrayList<Integer> numList = new ArrayList<>();
        int sum = 0;
        
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                sum = numbers[i] + numbers[j];
                if (numList.contains(sum) == false) {
                    numList.add(sum);
                }
            }
        }
        
        Collections.sort(numList);
        int answer[] = new int[numList.size()];
        int i = 0;
        for (int num : numList) {
            answer[i] = num;
            i++;
        }
        
        return answer;
    }
    
    public int[] otherSolutionOne(int[] numbers) {
        Set<Integer> sumNumbers = new TreeSet<>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sumNumbers.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[sumNumbers.size()];
        int cnt = 0;
        Iterator iter = sumNumbers.iterator();
        
        while (iter.hasNext()){
            answer[cnt] = (int) iter.next();
            cnt++;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        LvOne003 lv003 = new LvOne003();
        int[] caseOne = new int[]{2, 1, 3, 4, 1};
        int[] caseTwo = new int[]{5, 0, 2, 7};
        
        // mySolution
        int [] resultOneFromMySolution = lv003.mySolution(caseOne);
        System.out.println(Arrays.toString(resultOneFromMySolution));
        
        int [] resultTwoFromMySolution = lv003.mySolution(caseTwo);
        System.out.println(Arrays.toString(resultTwoFromMySolution));
        
        // otherSolutionOne
        int [] resultOneFromOtherSolution = lv003.otherSolutionOne(caseOne);
        System.out.println(Arrays.toString(resultOneFromOtherSolution));
        
        int [] resultTwoFromOtherSolution = lv003.otherSolutionOne(caseTwo);
        System.out.println(Arrays.toString(resultTwoFromOtherSolution));
    }
}
