public class OneTwo {
    // this will check if the second string is a permutation of the first string

    public static void main(String[] args){
        System.out.println(permutation("aabb", "aabb"));
        System.out.println(permutation("aabb", "aabbcc"));

    }

    static boolean permutation(String s1, String s2){
        int[] times = new int[128];
        char[] s1_char = s1.toCharArray();
        char[] s2_char = s2.toCharArray();
        for (char c : s1_char){
            times[Character.getNumericValue(c)] += 1;
        }
        for (char c : s2_char){
            times[Character.getNumericValue(c)] -= 1;
        }
        for (int i : times){
            if (i < 0){
                return false;
            }
        }

        return true;
    }
    
}