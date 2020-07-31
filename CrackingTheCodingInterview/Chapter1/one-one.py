# check if string has all unqiue characters

def check(s):
    string_values = list(s)
    unique = [False] * 128
    for string in string_values:
        if (unique[ord(string)]):
            return False
        else:
            unique[ord(string)]= True
    return True            

# check if cannot use additional space 

def check_nospace(s):
    sorted_list = sorted(s)
    for x in range(0, len(sorted_list)-1):
        if (sorted_list[x] == sorted_list[x+1]):
            return False
    return True

print(check("helo"))
print(check_nospace("helo"))
print(check_nospace("ss"))