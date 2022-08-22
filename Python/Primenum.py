
n1 = int(input('Intial Number Of The Range Of Prime Numbers To Check'))
n2 = int(input('Final Number Of The Range Of Prime Numbers To Check'))

for num in range(n1 ,n2 +1):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                print(num, "is not a prime number")
                break
        else:
            print(num, "is a prime number")

    else:
        print(num, "is not a prime number")
