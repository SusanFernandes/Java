def binS(arr, low, high, num):
    if high >= low:
        mid = (low + high) // 2
        if arr[mid] == num:
            return True
        elif arr[mid] > num:
            return binS(arr, low, mid - 1, num)
        else:
            return binS(arr, mid + 1, high, num)
    else:
        return False

# Example:
arr = [1, 3, 5, 7, 9, 11]
num = 2
print(binS(arr, 0, len(arr)-1, num))  # ✅ Output: True
