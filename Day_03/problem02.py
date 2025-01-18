def revNum(n):
    if n == 0:
        return 0
    else:
        rev=0
        while n>0:
            rem=n%10
            rev=rev*10+rem
            n=n//10
        return rev
n=eval(input("Enter a number:"))
print(revNum(n))