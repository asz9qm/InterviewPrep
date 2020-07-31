# one edit away

def check(one, two):
    if (len(one) == len(two)):
        return replace(one, two)
    elif(len(one) == len(two)+1):
        return single_dif(one, two)
    elif(len(one) == len(two)-1):
        return single_dif(two, one)
    else:
        return False

def replace(one, two):
    differences = 0
    for x in range(0, len(one)):
        if (one[x] != two[x]):
            differences += 1
    if (differences <= 1):
        return True
    return False

def single_dif(one, two):
    index_one = 0
    index_two = 0
    while (index_one < len(one) and index_two < len(two)):
        if(one[index_one] != two[index_two]):
            index_one += 1
            if(index_one != index_two):
                return False
        else:
            index_one += 1
            index_two += 1
    return True
