def pattern06(n):
    for i in range(0, n):
        for j in range(1,n-i+1):
            print(j, end=' ')
        print()
pattern06(4)