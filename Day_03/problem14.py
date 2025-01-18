def print_fibonacci_series(n):
    if n <= 0:
        print("Invalid input. Please enter a positive number.")
        return

    a, b = 0, 1
    print(a, end=" ")
    if n > 1:
        print(b, end=" ")
    for _ in range(2, n):
        nxt=a+b
        a=b
        b=nxt
        print(b, end=" ")

print_fibonacci_series(10)
