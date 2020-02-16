alphabet = dict()
for i in range(97,123):
    alphabet[chr(i)] = 0
a = input()
for x in a:
    alphabet[x] += 1

print(*alphabet.values(),sep=" ")