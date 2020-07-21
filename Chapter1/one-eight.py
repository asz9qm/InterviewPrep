# if there is any row or column in the matrix with 0, make the whole row/column 0
def zero_matrix(matrix):
    col = False
    row = False
    for y in range(0, len(matrix)):
        if (matrix[y][0] == 0):
            col = True
    for x in range(0, len(matrix[0])):
        if (matrix[0][x] == 0):
            row = True
    for y in range(1, len(matrix)):
        for x in range(1, len(matrix[y])):
            if (matrix[y][x] == 0):
                if (x != 0 ):
                    matrix[0][x] = 0
                if (y != 0):
                    matrix[y][0] = 0
    # makes the columns 0
    for item in range(1,len(matrix[0])):
        if (matrix[0][item] == 0):
            for y in range(len(matrix)):
                matrix[y][item] = 0
    # makes the rows 0
    for item in range(1, len(matrix)):
        if (matrix[item][0] == 0):
            for x in range(len(matrix[0])):
                matrix[item][x] = 0
    #check if first row and column should be 0
    if (row):
        for x in range(len(matrix[0])):
            matrix[0][x] = 0
    if (col):
        for y in range(len(matrix)):
            matrix[y][0] = 0
    return matrix
    
def print_matrix(matrix):
    for y in matrix:
        print(y)