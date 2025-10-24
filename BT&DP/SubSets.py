arr = [1,2,3,4,4]
result = []
i = 0
all = [] 

def sub(arr, result, i, all):

    if i ==len(arr):
        all.append(result.copy())
        # print(result, end = " ")
        return all
    result.append(arr[i])
    sub(arr, result, i+1, all)
    result.pop()
    sub(arr, result, i+1,all)
    return

if __name__ == "__main__":
    a = sub(arr,result, i, all)
    print(all)

