import math
arr = [1,2,5,4,5]
n = 5
def isSorted(arr, n):
    if n == 1 or n == 0 :
        return True
    return isSorted(arr, n-1) and arr[n-1]>= arr[n-2]


if __name__ == "__main__":
    a = isSorted(arr, n)
    print(a)
    # b = 0+4/2
    # b = math.ceil(b)
    # print(b)

