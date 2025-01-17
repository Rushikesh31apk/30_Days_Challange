def problem10(n):
    for i in range(n):
        print("* " * (i + 1))
    for j in range(n,0,-1):
        print("* " * (j-1))
problem10(4)