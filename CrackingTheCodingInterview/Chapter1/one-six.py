# string compression

def check(string):
    new_length = length_check(string)*2
    if (len(string) <= new_length):
        return string
    return compress(string, new_length)

def length_check(string):
    length = 1
    for i in range(0, len(string)-1):
        if (string[i] != string[i+1]):
            length += 1
    return length

def compress(string, length):
    array = [None] * length
    array_index = 0
    count = 1
    for i in range(0, len(string)):
        if(i+1 >= len(string) or string[i] != string[i+1]):
            array[array_index] = string[i]
            array[array_index+1] = str(count)
            array_index += 2
            count = 1      
        else:
            count += 1
    return "".join(array)




