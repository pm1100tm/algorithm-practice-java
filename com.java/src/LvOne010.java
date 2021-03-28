import org.junit.Assert;
import org.junit.Test;

/** 가운데 글자 가져오기 */
public class LvOne010 {
    
    public LvOne010 () {
    }
    
    /**
     * @author swd
     * @param  s: String 
     * @return String
     */
    public static String mySolution(String s) {
        if (s.length() % 2 != 0) {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
        
        return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
    }
    
    public static String otherSolution(String s) {
        return s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);
    }
    
    @Test
    public void Test() {
        String case_1 = "abcde";
        String case_2 = "qwer";
        
        String expected_1 = "c";
        String expected_2 = "we";
        
        Assert.assertEquals(expected_1, LvOne010.mySolution(case_1));
        Assert.assertEquals(expected_2, LvOne010.mySolution(case_2));
        
        Assert.assertEquals(expected_2, LvOne010.otherSolution(case_2));
        Assert.assertEquals(expected_2, LvOne010.otherSolution(case_2));
    }
    
    public static void main (String[] args) {
    }
}
