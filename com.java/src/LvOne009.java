import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 문자열 내림차순으로 배치하기 */
public class LvOne009 {
    
    public LvOne009 () {
    }
    
    /**
     * @author swd
     * @param  str : String 
     * @return String
     */
    public static String mySolution(String str) {
        String[] strList = str.split("");
        Arrays.sort(strList, Collections.reverseOrder());
        return String.join("", strList);
    }
    
    /**
     * @author swd
     * @param  str : String 
     * @return String
     */
    public static String otherSolutionOne(String str) {
        return Stream.of(str.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }
    
    /**
     * @author swd
     * @param  str : String
     * @return String
     */
    public static String otherSolutionTwo(String str) {
        char[] charList = str.toCharArray();
        Arrays.sort(charList);
        StringBuffer sb = new StringBuffer(String.valueOf(charList));
        sb.reverse();
        return sb.toString();
    }
    
    @Test
    public void Test() {
        String str = "Zbcdefg";
        String expected = "gfedcbZ";
        
        Assert.assertEquals(expected, LvOne009.mySolution(str));
        Assert.assertEquals(expected, LvOne009.otherSolutionOne(str));
        Assert.assertEquals(expected, LvOne009.otherSolutionTwo(str));
    }
}
