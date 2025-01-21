from collections import Counter

def most_frequent(nums: list) -> int:
    count = Counter(nums)
    return count.most_common(1)[0][0]

# Test case
print(most_frequent([1, 2, 2, 3, 3, 3, 4]))  # Output: 3