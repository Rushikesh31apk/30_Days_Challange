def probelm07(n):
    cnt=n+1
    for i in range( n):
        for j in range(i+1):
            print(chr(65+cnt),end=" ")
            cnt-=1
        print()
probelm07(4)

