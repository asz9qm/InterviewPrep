#given two strings, check if the second is a permutation of the first

def permutation(s1, s2):
    s1_char = list(s1)
    s2_char = list(s2)
    values = [0] * 128
    for character in s1_char:
        values[ord(character)] += 1
    for character in s2_char:
        values[ord(character)] -= 1
    for item in values:
        if (item < 0):
            return False
    return True
    
print(permutation("aabb", "aabb"))
print(permutation("abc", "abcd"))
