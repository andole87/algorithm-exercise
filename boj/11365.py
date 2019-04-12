while True:
    c = input()
    if c == "END":
        break
    print("".join(list(reversed(c))))