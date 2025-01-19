#basic dsa problems
def countDigit(n):
    l=0
    while n>0:
        l+=1
        n=n//10
    return l
    # return len(str(n))
n=eval(input("Enter any number: "))
print("Number of digits in the number is: ",countDigit(n))