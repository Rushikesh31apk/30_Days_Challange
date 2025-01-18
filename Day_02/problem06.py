def problem06(N):
    for i in range(1, N + 1):
        print(" " * (N - i), end="")
        for j in range(i):
            print(chr(65 + j), end="")
        for j in range(i - 2, -1, -1):
            print(chr(65 + j), end="")
        print()

N = 3
problem06(N)
