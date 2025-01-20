#very imp 
def are_angrams(s1,s2):
    return sorted(s1)==sorted(s2)
#Test
print(are_angrams("listen","silent"))
#very imp
print(are_angrams("hello", "world"))