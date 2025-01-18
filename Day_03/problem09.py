def numNto1(n):
    i=0
    if n ==i:
        return
    else:
        print(n,end=" ")
        return numNto1(n=n-1)
numNto1(5)