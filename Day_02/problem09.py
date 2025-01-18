def problem09(n):
    if(n%2 ==0):
        return True
    else:
        return False
n=eval(input("Enter any number: "))
if(problem09(n)):
    print("The number is even")
else:
    print("The number is odd")