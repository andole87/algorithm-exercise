def rot(a,c):
    alphabet = [chr(x) for x in range(97,123)]
    t = alphabet.index(a)
    if t > 12:
        t -= 13
    else:
        t += 13
    if c:
        return alphabet[t].upper()
    else:
        return alphabet[t]

a = input()
r = []
for x in a:
    if x == " ":
        r.append(" ")
        continue
    if x.isnumeric():
        r.append(x)
        continue
    r.append(rot(x.lower(),x.isupper()))
print("".join(r))