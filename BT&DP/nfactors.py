result = []
nums = 100
def nfactors(nums):
    num = nums//2 + 1
    for i in range(1, num):
        if nums% i == 0:
            result.append(i)
    result.append(nums)

    return result

if __name__ == "__main__":
    ans = nfactors(nums)
    print(ans)
    print(len(ans))