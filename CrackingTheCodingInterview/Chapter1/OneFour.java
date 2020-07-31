public class OneFour {

    public static void main(String[] args){
        System.out.println(check("taco cat"));
        System.out.println(check("h e h"));
        System.out.println(check("hh"));
        System.out.println(check("h"));
        System.out.println(check("abc"));
        
    }

    static Boolean check(String str){
        String lowerCase = str.toLowerCase();
        int[] array = new int[26];
        int a_value = Character.valueOf('a');
        int z_value = Character.valueOf('z');
        int trueLength = 0;
        for (int i = 0; i < lowerCase.length(); i++){
            int value = Character.valueOf(lowerCase.charAt(i));
            if (value >= a_value && value <= z_value){
                array[value-a_value]++;
                trueLength++;
            }
        }
        int odd = 0;
        for (int i : array){
            if(i % 2 == 1){
                odd++;
            }
        }
        if (trueLength % 2 == 0){
            if (odd == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if (odd == 1){
                return true;
            }
        }

        return false;
    }
    
}