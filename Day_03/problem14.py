def print_fibonacci_series(n):
    if n <= 0:
        print("Invalid input. Please enter a positive number.")
        return

    a, b = 0, 1
    nxt=0
    for _ in range(0, n):
        print(nxt, end=" ")# 0 1 1 2
        nxt=a+b #0+1=1 1+0=1 1+1=2 2+1=3
        b=a # 0 1 1 2
        a=nxt # 1 1 2 3
        

print_fibonacci_series(10)
