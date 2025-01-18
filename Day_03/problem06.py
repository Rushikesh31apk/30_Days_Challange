def printAllDiv(n):
    for i in range(1, n + 1):
        if n % i == 0:
            print(i, end = " ")
n=eval(input("Enter your number: "))
printAllDiv(n)