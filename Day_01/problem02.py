def pattern02(n):
    for i in range(0, n+1):
        for j in range(0, i):
            print("* ",end="")
        print()
pattern02(4)

# * 
# * *
# * * *
# * * * *