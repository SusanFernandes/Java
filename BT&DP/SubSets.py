arr = [1,2,4,4]
result = []
i = 0
all = [] 

def sub(arr, result, i, all):
    #for unique
    # if arr[i] == arr[i-]
    if i ==len(arr):
        if result not in all:
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

