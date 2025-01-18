def problem03(n):
    for i in range(n+1):
        for j in range(i+1):
            print(chr(65+j),end=" ")
        print()
problem03(5)