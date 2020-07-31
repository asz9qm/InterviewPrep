public class OneThree{

    public static void main(String[] args){


    }
    static char[] replace(char[] array){
        int count = 0;
        for (char c : array){
            if (c == ' '){
                count++;
            }
        }
        int length = array.length;
        int newIndex = length + 2*count;
        for (int i = length-1; i > 0; i--){
            if (array[i] == ' '){
                array[newIndex] = '0';
                array[newIndex-1] = '2';
                array[newIndex-2] = '%';
                newIndex -= 3;

            }
            else{
                array[newIndex] = array[i];
                newIndex -= 1;
            }

        }
        return array;
    }
}