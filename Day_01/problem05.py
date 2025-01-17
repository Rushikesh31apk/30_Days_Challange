def pattern05(n):
    for i in range(0,n):
        for j in range(n,i,-1):
            print("*" ,end=" ")
        print()
pattern05(4)