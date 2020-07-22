# String rotation, check if a string is a rotation of the other
# assume you have a method that checks if a string is a substring of another
# if a string is a rotation of another, 2 of the original string should have the rotation

def check(s1, s2):
    if (len(s1) != len(s2)):
        return False
    return substring(s1, 2*s2)
    