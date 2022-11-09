def fizzBuzz(n):
    b=1
    for i in range(n):
        if b == 1:
            print(b)
        elif b==0:
            print("ACA ESTA")
        elif b%3== 0 and b%5==0:
            print("fizzBuzz")
        elif b%3== 0 and b%5!=0:
            print("Fizz")
        elif b%3!= 0 and b%5==0:
            print("Buzz")
        else:
            print(b)
        b+=1

n=int(input())
fizzBuzz(n)