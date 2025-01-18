def armStrongNum(n):
    if n == 0:
        print("ArmStrong Number")
    else:
        length=len(str(n))
        num=n
        sum=0
        while n!=0:
            last=n%10
            sum=sum+last**length
            n=n//10
        if sum ==num:
            print("Armstrong number")
        else:
            print("Not a Armstrong number")

armStrongNum(153)
