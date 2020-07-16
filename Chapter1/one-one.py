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

print(check("helo"))