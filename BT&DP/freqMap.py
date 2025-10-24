nums = [1  ,1,3,4,2,3,2,1,3,4,5,4,3,2,1,3,1,1,3,5,6,8,9,7,6,5,8,7,5,8]
freq_map = { } 
fm =dict()


for  i in range(0, len(nums)): 
    if nums[i] in freq_map:
        freq_map[nums[i]] += 1

    else :
        freq_map[nums[i]] = 1

print(freq_map  )