# defines a list that can hold multiple fixed sized stacks
class MultiStack:
    size = 0
    numOfStacks = 0
    values = []
    ending = []

    def __init__(self, num=3):
        self.size = 2
        self.numOfStacks = num
        self.values = [0]*self.size*num
        self.ending = [0]*num

    def expand(self):
        self.size = self.size*2
        temp = [0]*self.size*self.numOfStacks
        for i in range(self.numOfStacks):
            for k in range(self.ending[i]):
                temp[i*self.size+k]=self.values[i*self.size//2+k]
        self.values = temp

    def push(self, value, stack):
        if (self.ending[stack-1] >= self.size):
            self.expand()
        self.values[(stack-1)*self.size+self.ending[stack-1]] = value
        self.ending[stack-1] += 1

    def pop(self, stack):
        if(self.ending[stack-1] == 0):
            return None
        else:
            temp = self.values[(stack-1)*self.size+self.ending[stack-1]-1]
            self.values[(stack-1)*self.size+self.ending[stack-1]-1] = 0
            self.ending[stack-1] -= 1
            return temp

    def peek(self, stack):
        if(self.ending[stack-1] == 0):
            return None
        else:
            return self.values[(stack-1)*self.size+self.ending[stack-1]-1]

    def empty(self, stack):
        return (self.ending[stack-1]==0)
