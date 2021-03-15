import java.io.PrintWriter;

/** 수박수박수박수박수박수 */
public class LvOne002 {
    /**
     * @author pm1100tm
     * @param n
     * @return String: answer
     */
    public String mySolution(int n){
        String answer = "";

        if (n < 1){
            return answer;
        }

        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                answer += "수";

            } else {
                answer += "박";
            }
        }

        return answer;
    }

    public String otherSolutionOne(int n){
        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
    }

    public String otherSolutionTwo(int n){
        String answer = "";
        for (int i = 0; i < n; i++){
            answer += i % 2 == 0 ? '수' : '박';
        }

        return answer;
    }

    public static void main(String[] args) {
        LvOne002 lv = new LvOne002();
        int [] testCase = {0, 1, 2, 3, 4};

        for (int i = 0; i < testCase.length; i++){
            String answer = lv.mySolution(testCase[i]);
            System.out.println(answer);
        }
    }
}
