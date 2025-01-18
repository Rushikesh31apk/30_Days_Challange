def checkPalidrome(name):
    name = name.lower()
    return name == name[::-1]
# Test the function
print(checkPalidrome("radar"))  # True