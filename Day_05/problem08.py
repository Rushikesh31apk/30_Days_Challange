def second_largest(nums: list) -> int:
    unique_nums = list(set(nums))  # Remove duplicates
    unique_nums.sort()
    return unique_nums[-2] if len(unique_nums) > 1 else None

# Test case
print(second_largest([3, 1, 4, 1, 5, 9]))  # Output: 5
