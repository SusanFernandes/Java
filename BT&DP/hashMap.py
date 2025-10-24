nums = [1  ,1,3,4,2,3,2,1,3,4,5,4,3,2,1,3,1,1,3,5,6,8,9,7,6,5,8,7,5,8]
hash_map = dict()
n = len(nums)

for i in range(0, n):
    hash_map[nums[i]] = hash_map.get(nums[i],0) + 1


print (hash_map)