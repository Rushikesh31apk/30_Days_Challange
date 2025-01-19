def bubbleSort(a,n):
    for i in range(n):
        for j in range(0, n-i-1):
            if a[j] > a[j+1] :
                a[j], a[j+1]= a[j+1], a[j]
    return a
a=[54,3,12,52,32,19,2,23]
print(bubbleSort(a,len(a)))