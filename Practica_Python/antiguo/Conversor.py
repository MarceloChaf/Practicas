num =[]
comprobador = True
print("si ingresa mas de un digito el programa terminara")
print(("Ingrese un numero binario de izquierda a derecha: "))
while comprobador == True:
    numeros = input("Ingrese el siguiente digito ")
    if numeros == "0" or numeros == "1":
        num.append(numeros)
    else:
        comprobador = False
print ("El numero binario es: ",num)
#cear una funcion que reciba un numero binario en una tupla y lo convierta a decimal#
def convertir(num):
    numero = 0
    for i in range(len(num)):
        numero = numero + int(num[i])(2*(len(num)-i-1))
    return numero
print("y traducido a decimal es: ",convertir(num))