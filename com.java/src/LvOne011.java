import org.junit.Assert;
import org.junit.Test;

/** 문자열 다루기 기본 */
public class LvOne011 {
    
    public LvOne011 () {
    }
    
    /**
     * @author swd
     * @param  s: String 
     * @return boolean
     */
    public static boolean mySolution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return false;
            }
            
            return true;
        }
        
        return false;
    }

    /**
     * @author swd
     * @param  s: String 
     * @return boolean
     */
    public static boolean otherSolution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("^[0-9]*$");
        }
        return false;
    }
    
    @Test
    public void Test() {
        String test_1 = "a234";
        String test_2 = "1234";
        String test_3 = "1a34";
        String test_4 = "12a4";
        String test_5 = "123a";
        String test_6 = "0000";
        
        Assert.assertFalse(LvOne011.mySolution(test_1));
        Assert.assertTrue(LvOne011.mySolution(test_2));
        Assert.assertFalse(LvOne011.mySolution(test_3));
        Assert.assertFalse(LvOne011.mySolution(test_4));
        Assert.assertFalse(LvOne011.mySolution(test_5));
        Assert.assertTrue(LvOne011.mySolution(test_6));
        
        Assert.assertFalse(LvOne011.otherSolution(test_1));
        Assert.assertTrue(LvOne011.otherSolution(test_2));
        Assert.assertFalse(LvOne011.otherSolution(test_3));
        Assert.assertFalse(LvOne011.otherSolution(test_4));
        Assert.assertFalse(LvOne011.otherSolution(test_5));
        Assert.assertTrue(LvOne011.otherSolution(test_6));
    }
}
