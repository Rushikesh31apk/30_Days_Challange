def checkPalidrome(n):
    if n == 0:
        return True
    else:
        num=n
        rev =0
        while n !=0:
            last_digit = n % 10
            rev= rev*10+last_digit
            n = n//10
        if rev == num:
            return True
        else:
            return False
n =eval(input("enter your number: "))
if(checkPalidrome(n)):
    print("number is palidrome")
else:
    print("number is not palidrome")
