def num1toN(n, i=1):
    if i == n:
        print(i)
        return
    else:
        print(i, end=" ")
        num1toN(n, i + 1)

num1toN(5)
