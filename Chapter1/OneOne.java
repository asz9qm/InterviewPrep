public class OneOne {
    public static void main(String[] args){
        System.out.println(check("hello"));
        System.out.println(check("helo"));
    }
    static boolean check(String s){
        boolean[] unique = new boolean[128];
        char[] characterArray = s.toCharArray();
        for (char c : characterArray){
            if (unique[Character.getNumericValue(c)]){
                return false;
            }
            else {
                unique[Character.getNumericValue(c)] = true;
            }
        }
        return true;
    }
}