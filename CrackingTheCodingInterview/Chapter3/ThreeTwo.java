package CrackingTheCodingInterview.Chapter3;

public class ThreeTwo 
{
    public class StackWithMin extends MyStack<Integer>
    {
        MyStack<Integer> s2;
        public StackWithMin()
        {
            s2 = new MyStack<Integer>();
        }

        public void push(int value)
        {
            if(value < min())
            {
                s2.push(value);
            }
            super.push(value);
            s2.push(s2.peek());
        }

        public Integer pop()
        {
            s2.pop();
            return super.pop();
        }

        public Integer min()
        {
            if(s2.isEmpty())
            {
                return Integer.MAX_VALUE;
            }
            else
            {
                return s2.peek();
            }
        }
    }   
    
}