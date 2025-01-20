def largestEleinArr(a,n):
    maxEle = a[0]
    for i in range(1,n):
        if a[i] > maxEle:
            maxEle = a[i]
    return maxEle


# Test the function
arr = [10, 20, 30, 40, 50]
print(largestEleinArr(arr, len(arr)))  # Output: 50