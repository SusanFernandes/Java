#     Problem 1: The Secret Passcode (Backtracking – Permutations)
#     🧩 Story
#     Imagine you are designing a digital lock.
#     The digits [1, 2, 3] can be arranged in any order — each order gives a different passcode.
#     You need to generate all possible passcodes.
#     This is a backtracking problem because:
#     You build a passcode digit by digit.
#     You "try" a digit → recurse → “undo” it → try another.

# def permute(nums):
#     res= []

#     def backtrack(path):
#         if len(path) == len(res):
#             res.append(path[:])
#             return
        
#         for n in nums:
#             if n not in nums: 
#                 path.append(n)
#                 backtrack(path)
#                 path.pop()

#     backtrack([])
#     return res

# if __name__ == "__main__":
#     num = [1,23,4,5]
#     ans = permute(num)
#     for p in ans:
#         print(p) 
        






# 🧠 Step-by-step logic
# Start with an empty path ([]).
# For each number not yet used:
# Add it to the path.
# Recurse (go deeper).
# Remove it afterward (backtrack).
# When the path length = total digits → record that passcode.


# def permute(nums):
#     res = [] #final result list

#     def backtrack(path):
#         #base case : all digits used
#         if len(path) == len(nums):
#             res.append(path[:])
#             return
        
#         for n in nums :
#             if n not in path: 
#                 path.append(n)
#                 backtrack(path) #recurse deeper
#                 path.pop() #undo (backtrack)

#     backtrack([])
#     return res

# if __name__ == "__main__":
#     num = [1,2,3]
#     print("All possible passcodes: ")
#     ans = permute(num)
#     for a in ans : 
# #         print (a)




