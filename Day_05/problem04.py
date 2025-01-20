def findDublicates(list):
    seen=set()
    duplicates=[]
    for item in list:
        if item in seen:
            duplicates.append(item)
            seen.add(item)
        else:
            seen.add(item)
    return duplicates

#test
print(findDublicates([1,2,3,4,5,2,3,]))