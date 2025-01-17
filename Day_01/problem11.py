def problem11(n):
    for i in range(1, n + 1):
        z = i % 2
        for j in range(i):
            print(z, end=" ")
            z = 1 - z
        print() 

problem11(4)
