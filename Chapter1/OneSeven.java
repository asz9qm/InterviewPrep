// rotate a matrix 90 degrees clockwise in place
public class OneSeven 
{
    static int[][] rotate(int[][] array)
    {
        int size = array.length;
        int temp = 0;
        int offset = size-1;
        for (int x = 0; x < size/2; x++)
        {
            for (int y = 0; y < size/2; y++)
            {
                temp = array[x][y];
                array[x][y] = array[offset-y][x];
                array[offset-y][x] = array[offset-x][offset-y];
                array[offset-x][offset-y] = array[offset-x][y];
                array[offset-x][y] = temp;
            }
        }
        return array;
    }
    
}