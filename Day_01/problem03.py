def pattern03(n):
    for i in range(0, n+1):
        for j in range(1, i+1):
            print(j ,end=" ")
        print()
pattern03(4)

# 1 
# 1 2 
# 1 2 3 
# 1 2 3 4 