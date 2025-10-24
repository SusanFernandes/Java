def consecutiveNumbers():
    nums = [1, 99, 101, 98, 2,5,3,100,1,1]
    my_set = set()
    for i in range(0, len(nums)):
        my_set.add(nums[i])
    longest = 0
    for num in my_set:
        if (num-1) not in my_set:
            x = num
            count = 1
            while (x+1) in my_set:
                count += 1
                x+=1
            longest = max (longest, count)
    return longest


    # n = len(nums)
    # max_count = 0
    # for i in range(0,n):
    #     num = nums[i]
    #     count = 1
    #     while (num+1) in nums:
    #         count += 1
    #         num = num+1
    #     max_count = max(max_count, count)
    # return max_count

if __name__ == "__main__":
    n = consecutiveNumbers()
    print(n)
    print(consecutiveNumbers())