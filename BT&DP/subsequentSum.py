#if subsequence with sum = k
nums = [3,3,5,2,1,3,7,8,9,-1]
k =9
result = []
def backtrack ( index, total, subset):
    if total == k :
        result.append(subset.copy())
        return True
    elif total > k:
        return False
    if index>= len(nums):
        return False
    
    subset.append(nums[index])
    sum = total + nums[index]
    pick = backtrack(index + 1, sum, subset)
    if pick == True : return True
    subset.pop()
    sum = total
    not_pick = backtrack(index + 1, sum, subset)
    return not_pick

if __name__ == "__main__":
    n = backtrack(0, 0, [])
    print(n)