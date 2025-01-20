def count_vowels_consonants(s: str) -> dict:
    vowels = "aeiou"
    count = {'vowels': 0, 'consonants': 0}
    
    for char in s.lower():
        if char.isalpha():
            if char in vowels:
                count['vowels'] += 1
            else:
                count['consonants'] += 1
    return count

# Test case
print(count_vowels_consonants("hello world"))  # Output: {'vowels': 3, 'consonants': 7}
