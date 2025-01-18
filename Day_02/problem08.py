def problem08(n):
    sp = 2 * n - 2
    for i in range(2 * n - 1):
        if i < n: stars = i + 1
        else: stars = 2 * n - i - 1
        for j in range(stars):print("* ", end="")
        for l in range(sp):print("  ", end="")
        for k in range(stars):print("* ", end="")
        if i < n - 1: sp -= 2
        else: sp += 2
        print()
problem08(3)
