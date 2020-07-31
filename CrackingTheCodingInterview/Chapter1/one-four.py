# palindrome permutation

def check(string):
    string = string.lower()
    a_value = ord("a")
    z_value = ord("z")
    array = [0]*26
    true_length = 0
    for x in range(0, len(string)):
        value = ord(string[x])
        if(value >= a_value and value <= z_value):
            array[value-a_value] += 1
            true_length += 1
    odd = 0
    for value in array:
        if (value % 2 == 1):
            odd += 1
    if (true_length % 2):
        if(odd == 1):
            return True
        else:
            return False
    else:
        if(odd):
            return False
    return True

print(check("tact coa")) #true
print(check("h e  h")) #true
print(check("hh"))  #true
print(check("e")) #true
print(check("abc")) #false