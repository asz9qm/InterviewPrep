package CrackingTheCodingInterview.Chapter1;

import java.util.Arrays;

public class OneOne {
    public static void main(String[] args){
        System.out.println(check("hello"));
        System.out.println(check("helo"));
        System.out.println(checkNoSpace("aa"));
        System.out.println(checkNoSpace("abc"));

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

    static boolean checkNoSpace(String s){
        char[] characterArray = s.toCharArray();
        Arrays.sort(characterArray);
        for (int i = 0; i < characterArray.length-1; i++){
            if (characterArray[i] == characterArray[i+1]){
                return false;
            }
        }
        return true;

    }

}