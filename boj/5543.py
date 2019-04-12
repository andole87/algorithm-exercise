s = []
for _ in range(5):
    s.append(int(input()))
a = s[:3]
b = s[3:5]
print(min(a) + min(b) - 50)