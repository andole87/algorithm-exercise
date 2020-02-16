a = input()
b = ""
for x in a:
    if x.isupper():
        b += x.lower()
    else:
        b += x.upper()
print(b)