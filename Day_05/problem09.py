def merge_sorted_lists(list1: list, list2: list) -> list:
    return sorted(list1 + list2)

# Test case
print(merge_sorted_lists([1, 3, 5], [2, 4, 6]))  # Output: [1, 2, 3, 4, 5, 6]
