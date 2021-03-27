import java.util.Arrays;

/** 김서방 찾기 */
public class LvOne007 {
    /**
     * @author swd
     * @param  seoul : String[]
     * @return answer
     */
    public static String mySolution(String[] seoul) {
        int count = 0;
        for (String name : seoul) {
            if (name.equals("Kim")) {
                break;
            }
            count++;
        }
        return "김서방은 " + count + "에 있다";
    }
    
    public static void main(String[] args) {
        String answer = mySolution(new String[]{"Jane", "Kim"});
        System.out.println(answer);
    }
}
