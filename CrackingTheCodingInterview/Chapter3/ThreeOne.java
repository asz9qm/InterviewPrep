package CrackingTheCodingInterview.Chapter3;

// uses a single array to create 3 fixed sized stacks
public class ThreeOne
{

    private int size;
    private int numOfStacks;
    private int[] values;
    private int[] lengths;

    public ThreeOne(int num)
    {
        this.size = 2;
        this.numOfStacks = num;
        this.values = new int[num*2];
        this.lengths = new int[num];
    }

    private void expand()
    {
        this.size *= 2;
        int[] temp = new int[this.size*this.numOfStacks];
        for (int i = 0; i < self.numOfStacks; i++)
        {
            for (int k = 0; k < self.numOfStacks; k++)
            {
                temp[i*this.size+k] = this.values[i*self.size /2+k];
            }
        }
        this.values = temp;

    }

    public void push(int value, int array)
    {
        if (this.lengths[array-1] >= this.size)
        {
            this.expand();
        }
        this.values[(array-1)*this.size + this.values[array-1]] = value;
        this.lengths[array-1] += 1;
    }

    public int pop(int array)
    {
        if (this.lengths[array-1] == 0)
        {
            return null;
        }
        else
        {
            int temp = this.values[(array-1)*this.size+this.lengths[array-1]-1];
            this.values[(array-1)*this.size+this.lengths[array-1]-1] = 0;
            this.lengths[array-1]--;
        }
        return array;
    }

    public int peek(int array)
    {
        if (this.lengths[array-1] == 0)
        {
            return null;
        }
        else
        {
            return this.values[(array-1)*this.size+this.lengths[array-1]-1];
        }
    }

    public int empty(int array)
    {
        return (self.lengths[array-1] == 0);
    }




    
}