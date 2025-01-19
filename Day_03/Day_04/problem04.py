def mergeSort(a,n):
    if n>1:
        mid = n//2
        left = a[:mid]
        right = a[mid:]
        mergeSort(left,len(left))
        mergeSort(right,len(right))
        merge(left,right,a)
    return a

def merge(left,right,a):
    i = j = k = 0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            a[k] = left[i]
            i += 1
            k += 1
        else:
            a[k] = right[j]
            j += 1
            k += 1
    while i<= len(left)-1:
        a[k] = left[i]
        i += 1
        k += 1
    while j<= len(right)-1:
        a[k] = right[j]
        j += 1
        k += 1
    
a=[54,3,12,52,32,19,2,23]
print(mergeSort(a,len(a)))