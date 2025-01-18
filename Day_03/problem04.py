def gcd(a,b):
    while b:
        a, b = b, a % b
    return a
def lcm(a,b):
    return (a * b) // gcd(a,b)

a=eval(input("Enter First number: "))
b=eval(input("Enter Second number: "))

print("GCD of",a,"and",b,"is",gcd(a,b))

print("LCM of",a,"and",b,"is",lcm(a,b))