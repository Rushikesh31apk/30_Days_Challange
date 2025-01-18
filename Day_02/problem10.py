def calsci(a,b, opration):
    match opration:
        case 'add':
            return a + b
        case 'subtract':
            return a - b
        case 'multiply':
            return a * b
        case 'divide':
            if b != 0:
                return a / b
            else:
                return "Error: Division by zero is not allowed"
        case _:
            return "Invalid operation"
a=eval(input("Enter first digit: "))
b=eval(input("Enter second digit: "))
opration=input("Enter operation (add, subtract, multiply, divide): ")
print("Result: ",calsci(a,b, opration))