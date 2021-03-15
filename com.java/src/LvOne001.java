/** 문자열을 정수로 바꾸기 */
public class LvOne001 {

    public int mySolution(String s){
        return Integer.parseInt(s);
    }

    public int otherSolution(String str){
        boolean plus = true;
        int value = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                plus = false;

            } else {
                int num = ch - 48;
                value = num + value * 10;
            }


        }
        return (plus==true)? value : -1*value;
    }

    public static void main(String[] args) {
        LvOne001 l = new LvOne001();

        System.out.println(l.mySolution("1234"));
        System.out.println(l.mySolution("-1234"));

        System.out.println(l.otherSolution("1234"));
        System.out.println(l.otherSolution("-1234"));
    }
}
