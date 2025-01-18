def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
n=eval(input("enter your num: "))
print("factorial of ",n,"is",factorial(n))