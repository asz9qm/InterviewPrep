# Rotate a matrix 90 clockwise in place
import math
def rotate(matrix):
    temp = 0
    size = len(matrix)
    offset = size-1
    for x in range(0, math.ceil(size/2)):
        for y in range(0, math.ceil(size/2)):
            temp = matrix[x][y]
            matrix[x][y] = matrix[offset-y][x]
            matrix[offset-y][x] = matrix[offset-x][offset-y]
            matrix[offset-x][offset-y] = matrix[offset-x][y]
            matrix[offset-x][y]=temp
    return matrix



