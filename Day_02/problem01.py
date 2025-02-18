def problem01(N):
    for i in range(1, N + 1):
        # print right side
        for j in range(1, i + 1):
            print(j, end="")
        spaces = 2 * (N - i)
        print(" " * spaces, end="")
        for j in range(i, 0, -1):
            print(j, end="")
        print()
N = 3
problem01(N)
