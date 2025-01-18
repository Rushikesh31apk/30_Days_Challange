def problem04(n):
    for i in range(n+1):
        for j in range(n-i):
            print(chr(65+j), end=' ')
        print()
problem04(4)