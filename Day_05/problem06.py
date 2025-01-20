def findMissingNum(arr):
    n = len(arr)+1
    total = n * (n + 1) // 2
    return total - sum(arr)

# Test the function
arr = [1, 2, 3, 5, 6, 7,]
print(findMissingNum(arr))  # Output: 4