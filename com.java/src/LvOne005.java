import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 완주하지 못한 선수 */
public class LvOne005 {
    /**
     * @author pm1100tm
     * @param  participant, completion
     * @return String
     */
    public static String mySolution(String[] participant, String[] completion) {
        List<String> sortedParticipant = Stream.of(participant).sorted().collect(Collectors.toList());
        List<String> sortedCompletion = Stream.of(completion).sorted().collect(Collectors.toList());
        
        for (int i = 0; i < sortedCompletion.size(); i++) {
            if (!sortedCompletion.get(i).equals(sortedParticipant.get(i))) {
                return sortedParticipant.get(i);
            }
        }
        
        return sortedParticipant.get(sortedParticipant.size()-1);
    }
    
    public static String otherSolution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1);
        }
        
        for (Map.Entry entry : hm.entrySet()){
            if ((int) entry.getValue() != 0) {
                answer = (String)entry.getKey();
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        String[] participant1 = new String[] {"leo", "kiki", "eden"};
        String[] completion1 = new String[] {"eden", "kiki"};
        
        String answer = LvOne005.mySolution(participant1, completion1);
        String answer2 = LvOne005.otherSolution(participant1, completion1);
    }
    
    @Test
    public void testMySolution() {
        String[] participant1 = new String[] {"leo", "kiki", "eden"};
        String[] completion1 = new String[] {"eden", "kiki"};
        String answer1 = "leo"; 
        
        String[] participant2 = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2  = new String[] {"josipa", "filipa", "marina", "nikola"};
        String answer2 = "vinko";
        
        String[] participant3 = new String[] {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = new String[] {"stanko", "ana", "mislav"};
        String answer3 = "mislav";
        
        Assert.assertEquals(answer1, LvOne005.mySolution(participant1, completion1));
        Assert.assertEquals(answer2, LvOne005.mySolution(participant2, completion2));
        Assert.assertEquals(answer3, LvOne005.mySolution(participant3, completion3));
        
        Assert.assertEquals(answer1, LvOne005.otherSolution(participant1, completion1));
        Assert.assertEquals(answer2, LvOne005.otherSolution(participant2, completion2));
        Assert.assertEquals(answer3, LvOne005.otherSolution(participant3, completion3));
        
    }
}
